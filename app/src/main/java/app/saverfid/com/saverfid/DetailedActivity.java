package app.saverfid.com.saverfid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class DetailedActivity extends AppCompatActivity {

    private RoomModel roomModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed);
        Bundle bundle = getIntent().getExtras();

        this.roomModel = (RoomModel) bundle.getSerializable("RoomModel");

        TextView salon = (TextView)findViewById(R.id.salon);
        TextView estado = (TextView)findViewById(R.id.estado);
        TextView personas = (TextView)findViewById(R.id.personas);
        ImageView slider = (ImageView) findViewById(R.id.slider);

        switch (roomModel.getIntensidad()){
            case 10:
                slider.setImageResource(R.drawable.n_10);
                break;
            case 20:
                slider.setImageResource(R.drawable.n_20);
                break;
            case 30:
                slider.setImageResource(R.drawable.n_30);
                break;
            case 40:
                slider.setImageResource(R.drawable.n_40);
                break;
            case 50:
                slider.setImageResource(R.drawable.n_50);
                break;
            case 60:
                slider.setImageResource(R.drawable.n_60);
                break;
            case 70:
                slider.setImageResource(R.drawable.n_70);
                break;
            case 80:
                slider.setImageResource(R.drawable.n_80);
                break;
            case 90:
                slider.setImageResource(R.drawable.n_90);
                break;
            case 100:
                slider.setImageResource(R.drawable.n_100);
                break;
            default:
                slider.setImageResource(R.drawable.n_10);
                break;

        }

        salon.setText(roomModel.getNombre());
        estado.setText(roomModel.getEstatus() == 1 ? "Encendido" : "Apagado");
        personas.setText(String.valueOf(roomModel.getMaxPersonas()));

    }


}
