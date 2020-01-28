package yaneh.yaneh.recycler;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import yaneh.yaneh.MainActivity;
import yaneh.yaneh.R;

public class recadapter extends RecyclerView.Adapter<recadapter.Holder> {
    Context mcontext;
    List<citysModel> city;

    public recadapter(Context mcontext, List<citysModel> city) {
        this.mcontext = mcontext;
        this.city = city;
    }

    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(mcontext).inflate(R.layout.recadapter , viewGroup , false);
        return new Holder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int i) {
        holder.name.setText(city.get(i).getName());
    }

    @Override
    public int getItemCount() {
        return city.size();
    }

    class Holder extends RecyclerView.ViewHolder {
        TextView name ;
        ImageView img;
        public Holder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            img = itemView.findViewById(R.id.img);

            img.setOnClickListener(V->{
                Intent intent = new Intent(mcontext , MainActivity.class);
                intent.putExtra("name" , name.getText().toString());
                mcontext.startActivity(intent);
                //Toast.makeText(mContext, cars.get(getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();
            });
        }
    }
}
