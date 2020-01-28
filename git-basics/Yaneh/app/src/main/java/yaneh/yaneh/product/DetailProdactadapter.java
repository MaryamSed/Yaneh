package yaneh.yaneh.product;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import yaneh.yaneh.MainActivity;
import yaneh.yaneh.R;
import yaneh.yaneh.recycler.citysModel;

public class DetailProdactadapter extends RecyclerView.Adapter<DetailProdactadapter.Holder> {

    Context mcontext ;
    List<ProductModel> city;

    public DetailProdactadapter(List<ProductModel> city) {
        this.city = city;
    }

    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recadapter , viewGroup , false);
        mcontext = viewGroup.getContext();
        return new Holder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int i) {
        holder.name.setText(city.get(i).getName());
        holder.price.setText(city.get(i).getPrice()+"");
    }

    @Override
    public int getItemCount() {
        return city.size();
    }

    class Holder extends RecyclerView.ViewHolder {
        TextView name , price ;
        ImageView img;
        public Holder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            price = itemView.findViewById(R.id.price);
            img = itemView.findViewById(R.id.img);

            img.setOnClickListener(V->{
                Intent intent = new Intent(mcontext, MainActivity.class);
                intent.putExtra("name" , name.getText().toString());
                mcontext.startActivity(intent);
//                Toast.makeText(mcontext, "n,n,mn,mn ", Toast.LENGTH_SHORT).show();
            });
        }
    }
}
