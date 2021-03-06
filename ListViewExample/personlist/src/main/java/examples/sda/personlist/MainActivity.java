package examples.sda.personlist;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
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

import examples.sda.personlist.databinding.PersonListItemBinding;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView personListView = (ListView) findViewById(R.id.personList);
        Switch sortSwitch = (Switch) findViewById(R.id.sortSwitch);

        PersonProvider personProvider = new PersonProvider();
        final List<Person> personList = personProvider.provide();


        final PersonAdapter personAdapter = new PersonAdapter(personList, LayoutInflater.from(this));
        personListView.setAdapter(personAdapter);

        sortSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                final int sing = isChecked ? 1 : -1;
                Collections.sort(personList, new Comparator<Person>() {
                    @Override
                    public int compare(Person o1, Person o2) {
                        return sing * (o1.getAge() - o2.getAge());
                    }
                });
                personAdapter.notifyDataSetChanged();
            }
        });


    }

    class PersonAdapter extends BaseAdapter {
        private final List<Person> personList;
        private final LayoutInflater layoutInflater;

        public PersonAdapter(List<Person> personList, LayoutInflater layoutInflater) {
            this.personList = personList;
            this.layoutInflater = layoutInflater;
        }

        @Override
        public int getCount() {
            return personList.size();
        }

        @Override
        public Person getItem(int position) {
            return personList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            PersonListItemBinding binding;

            if (convertView == null) {
                binding = PersonListItemBinding.inflate(layoutInflater);
            }
            else {
                binding = DataBindingUtil.getBinding(convertView);
            }
            binding.setPerson(getItem(position));
            return binding.getRoot();
        }
    }
}
