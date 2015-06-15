package lukesterlee.c4q.nyc.superheropractice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Willee on 6/11/15.
 */

// TODO : 2. implement this custom adapter.
public class SuperpersonAdapter extends BaseAdapter {

    private Context mContext;
    private List<Superperson> mSuperpersonList;

    public SuperpersonAdapter(Context mContext, List<Superperson> mSuperpersonList) {
        this.mContext = mContext;
        this.mSuperpersonList = mSuperpersonList;
    }



    @Override
    public int getCount() {
        return mSuperpersonList.size();
    }

    @Override
    public Superperson getItem(int position) {
        return mSuperpersonList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = layoutInflater.inflate(R.layout.list_item_superperson, parent, false);

        ImageView thumbnail = (ImageView) row.findViewById(R.id.thumbnail_superperson);
        TextView name = (TextView) row.findViewById(R.id.textView_name);
        TextView secretName = (TextView) row.findViewById(R.id.textView_secretName);
        TextView nemesis = (TextView) row.findViewById(R.id.textView_nemesis);
        TextView powers = (TextView) row.findViewById(R.id.textView_powers);

        Superperson superPerson = mSuperpersonList.get(position);

        name.setText(superPerson.getName());

        secretName.setText(superPerson.getSecretIdentity());

        nemesis.setText(superPerson.getNemesis());



        List<String> powersList = superPerson.getPowersList();
        String powerStr = powersList.get(0);
        for(int i = 1; i < powersList.size(); i++){
            powerStr += ", " + powersList.get(i);
        }
        powers.setText(powerStr);


        Picasso.with(mContext).load(superPerson.getPictureUrl()).centerCrop().resize(200,200).into(thumbnail);


        return row;
    }
}
