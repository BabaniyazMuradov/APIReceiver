package Domain;

import DataSources.ReceiverApiDataSource;
import Models.InRadiusDto;
import Models.ReceiverModel;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import javax.sound.midi.Receiver;
import java.io.IOException;
import java.util.List;

public class ReceiverService {
   final ReceiverApiDataSource receiverApiDataSource;

    public ReceiverService(ReceiverApiDataSource receiverApiDataSource) {
        this.receiverApiDataSource = receiverApiDataSource;
    }

    List<Receiver> fetch(){
        InRadiusDto dto = new InRadiusDto(0,0,100000,0,10);
        Call<List<Receiver>> repos = receiverApiDataSource.listReceivers(dto);
        try{
            Response<List<Receiver>> res =  repos.execute();
            return res.body();
        }catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }

}
