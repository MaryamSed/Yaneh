package yaneh.yaneh;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerCityAdapter extends RecyclerView.Adapter<RecyclerCityAdapter.Holder> {

    Context mcontex;
    List<CityModel> citys;

    public RecyclerCityAdapter(Context mcontex, List<CityModel> citys) {
        this.mcontex = mcontex;
        this.citys = citys;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class Holder extends RecyclerView.ViewHolder {
        public Holder(@NonNull View itemView) {
            super(itemView);
        }
    }

//    @Override
//    public Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
//        View v = LayoutInflater.from(mcontex).inflate(R.layout.city_recycler , viewGroup , false);
//        return new Holder(v);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull RecyclerCityAdapter.Holder holder, int i) {
//        holder.cityname.setText(citys.get(i).getCityname());
//
//    }
//
//    @Override
//    public int getItemCount() {
//        return citys.size();
//    }
//
//    public class Holder extends RecyclerView.ViewHolder {
//        ImageView cityimg;
//        TextView cityname;
//        public Holder(@NonNull View itemView) {
//            super(itemView);
//            cityimg = itemView.findViewById(R.id.cityimg);
//            cityname = itemView.findViewById(R.id.cityname);
//
//        }
//    }
}
