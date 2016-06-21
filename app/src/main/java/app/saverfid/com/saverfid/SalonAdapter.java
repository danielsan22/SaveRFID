package app.saverfid.com.saverfid;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Daniel on 21/06/16.
 */
public class SalonAdapter extends BaseAdapter {

    private List<RoomModel> roomModelList;
    private Activity context;
    private LayoutInflater inflater;


    public SalonAdapter(Activity context, List<RoomModel> roomModelList) {
        this.context = context;
        this.roomModelList = roomModelList;
        this.inflater = context.getLayoutInflater();
    }

    public List<RoomModel> getRoomModelList() {
        return roomModelList;
    }

    @Override
    public int getCount() {
        return roomModelList.size();
    }

    @Override
    public RoomModel getItem(int i) {
        return roomModelList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View v = inflater.inflate(R.layout.list_view_item, null, true);

        TextView t = (TextView)v.findViewById(R.id.nombre);
        ImageView img = (ImageView)v.findViewById(R.id.status);

        t.setText(this.roomModelList.get(i).getNombre());

        if(this.getItem(i).getEstatus() == 0){
            img.setImageResource(R.mipmap.foco_0);
        }else{
            img.setImageResource(R.mipmap.foco_1);
        }




        return v;
    }
}
