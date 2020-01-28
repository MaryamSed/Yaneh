package yaneh.yaneh.product;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import yaneh.yaneh.R;

public class OpinionFragment extends Fragment {
    private static OpinionFragment fragment;
    public  static OpinionFragment getFragment(){
        if (fragment==null)
            fragment = new OpinionFragment();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.opinion_fragment , container , false);
        return v;
    }
}
