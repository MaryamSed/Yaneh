package yaneh.yaneh.Orders;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import yaneh.yaneh.R;

public class OrdersListAdapter extends BaseAdapter {
    Context mcontext;
    List<OrdersModel> orders;

    public OrdersListAdapter(Context mcontext, List<OrdersModel> orders) {
        this.mcontext = mcontext;
        this.orders = orders;
    }

    @Override
    public int getCount() {
        return orders.size();
    }

    @Override
    public Object getItem(int i) {
        return orders.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = LayoutInflater.from(mcontext).inflate(R.layout.ordersadapter,viewGroup,false);

        TextView title = v.findViewById(R.id.title);
        TextView price = v.findViewById(R.id.price);

        title.setText(orders.get(i).getTitle());
        price.setText(orders.get(i).getPrice());


        return v;
    }
}
