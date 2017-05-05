package examples.mahthart.kurswalut;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.support.design.widget.CollapsingToolbarLayout;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * A fragment representing a single Item detail screen.
 * This fragment is either contained in a {@link ItemListActivity}
 * in two-pane mode (on tablets) or a {@link ItemDetailActivity}
 * on handsets.
 */
public class ItemDetailFragment extends Fragment {
    public ItemDetailFragment() {
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
            mItem = DummyContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));

            Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
            if (appBarLayout != null) {
                appBarLayout.setTitle(mItem.content);
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.item_detail, container, false);

        // Show the dummy content as text in a TextView.
        if (mItem != null) {
            ((TextView) view.findViewById(R.id.item_detail)).setText(mItem.details);
        }



        ListView walutaListView = (ListView) view.findViewById(R.id.item_list);


    WalutaProvieder personProvider = new WalutaProvieder();
    final List<WalutaContent> personList = personProvider.provide();


    final WalutaAdapter walutaAdapter = new WalutaAdapter(walutaListView, LayoutInflater.from(this));
        walutaListView.setAdapter(WalutaAdapter);

//        sortSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//        @Override
//        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//            final int sing = isChecked ? 1 : -1;
//            Collections.sort(waltaList, new Comparator<Person>() {
//                @Override
//                public int compare(Person o1, Person o2) {
//                    return sing * (o1.getAge() - o2.getAge());
//                }
//            });
//            personAdapter.notifyDataSetChanged();
//        }
//    });

    class WalutaAdapter extends BaseAdapter {
        private final List<WalutaContent> walutaList;
        private final LayoutInflater layoutInflater;

        public WalutaAdapter(List<WalutaContent> walutaList, LayoutInflater layoutInflater) {
            this.walutaList = walutaList;
            this.layoutInflater = layoutInflater;
        }

        @Override
        public int getCount() {
            return walutaList.size();
        }

        @Override
        public WalutaContent getItem(int position) {
            return walutaList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            WalutaListItemBinding binding;
            if (convertView == null) {
                binding = WalutaListItemBinding.inflate(layoutInflater);

            }
            else {
                binding = DataBindingUtil.getBinding(convertView);
            }
            binding.setWaluta(getItem(position));
            return binding.getRoot();
        }
    }
        return view;
    }
}


