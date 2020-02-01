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

import com.bumptech.glide.Glide;

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

            Glide.with(mcontext).load("data:image/png;base64,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" +
                    "G8+Ur/KC2oyIPuV2fgVvVJmX90/hp38uRr4vqkhUNK2OOskTLSqppdVJtL1i4ZEC5FsX3/yLl9oQ0XWqoyJ4DLhjY5gIr/B2eTFiui8RlaY21xCi6SuytLz0v0vHd7pkSf2ILtnr4P0WvimrTY5odYOj16u3q59ZI5lko4/ZNe6AVix6T0mRaH5ErmU/UbR2kwe2RfqX3yZ/GYxcR/Th9b7gj95uamyT33IjP6Mjwx9tyBPVRXcbLoYRzb0F8dE5iWWiP5OF3EjCF3vmkEav/mxRbF6fynH9rJJ73wkodCQ4C18JeK5itHdkZx7nw3U0MGC+eCC8cR3ejB/43hFRvxhd3YWxcl3/R7p774mun5/RoHvZherBElt6G9RUEO61eV6iUziiAHTTlSVezn8/b17m53eMM1P5JHrxrFgsqtnuentzc7tbjnoL7nbuZW9PChW2bbGv2z36GEw5OhzPpeITG6gPnFpY2FPsL84vL7++Ls7PPz8vbnaZHO5dEKDOM0dsg9eyfMU9FeZa+/n5+fz8smOguo1iQkJFW246nD/oKLFFxLgu/TOmCjzo0t35h6K6fvxxc4ZbI/wPQr+rRldizHkk6uPF9R4CtPXveeb9kfpUy+0bPO+zfr3YyaTTtv2m7EQ/kLacgh4JjPrN9V6gXpmuU0P6RmuB6x3yI0uwdhVYEbawTf8VohqGzVRIpa1WRlvMXYTlFKaqPG4uBAU9+qtcJAU/iMtu+gvp0lQqYtIld4hExPUp+IiiCSMv1OghIPtKHGeqbDaUOuRaZOc+KOa+oCs2nZbnY9MgVSCrBqZu0XTrg9VQ2TDuj2wLAJE2yBZzF0NLSgw8q1YHxlANnGNtafZCjWygOgqDslCdR1qgLKqEqZDSaqmUpky2JkupoaYMsT6jc6XptZS31daavvJatsaPK8w8VTl0GO0STCijrCPWFt529bG9lhIXfORCtVyAlva13ha59mXE2zYRlz0Ccw6Vc6EKOd1Z7aTkdN5z7C3ePU6aypYH6xvyUBfVNi1u0+gCt52XgfrDKpqXAwpxjZGk9Di33reQlEZLQDFeKKoqRb8j3dZFdl/WtUxViE9Z8UvqMtNQOpHT2pJsOXTVpUEVvwaLLpsLI14MMSa2iz6PYcqhS2KgTHcxcR2PPrOZPzFRNScL2V8OfcxFlH8mtAwbYVxXZ3cmva2NTOk8Nbop3KkUoZip3mmObK0/pcUyjr3Meb7Z46Wpd8/aJjFqoBBjQFeFmi3JvUQ7DK3RFLakGKVpgfymvnG6FPcAceNDDRaICjg5UDPD60mEvHKb6qVhCaVYlaGWkVd9vEhllMF34kOB4nLoUMFxgurdjUmNuJNTio+NwJtoUySUN07q+ItDFeWBgbmaw9CB9DYU7ArTwcYkqYKgciD9kK9c8CyG3yeGejqBDRWmEDFvpskHcZR/kIPqy48REzmoPrAxEaRASI2VpwTKGlvMnX5SMqJvmf1RX5JwyIMlabjOuI5rvlsG0YEboR8qcDH3qcrf+SyZyUHRnRkazaEg/egch2is/TSVoela1KjQa3Qx99HSCF/MnVZDYYbXy2Kj5zo38DltXgiSTXB3m2nriLZaymiBcs61dy7ZAUomTKREm2Zui7nLCRz7UJjOX3BGmsHjJlHIJB9Rix43SikScX15qDgrtUM2ealbxRKcadL0ozQ3aCH70ncFESzd+nCsKJZySIqWQMBoEbtnHIyIcvoOjhd0zEHaJFvM/TuAQv+pTQs4KuAEfX/N8w4BO0I5WXyvgP2cIBVxnMC6/P9uGWYJm5b+diNi4RPE8t8ncmK37/9Q/pfV4SQnOclJTnKSk5zkJCc5yWHyXxmr5zcJJznRAAAAAElFTkSuQmCC").into(img);


            img.setOnClickListener(V->{
                Intent intent = new Intent(mcontext, MainActivity.class);
                intent.putExtra("name" , name.getText().toString());
                mcontext.startActivity(intent);
//                Toast.makeText(mcontext, "n,n,mn,mn ", Toast.LENGTH_SHORT).show();
            });
        }
    }
}
