package jp.tokushima.tatsuhama.listviewitemborder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by tatsuhama on 15/12/31.
 */
public class MyAdapter extends ArrayAdapter<Boolean> {
    public MyAdapter(Context context) {
        super(context, 0);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder holder;
        if (convertView != null) {
            holder = (ViewHolder) convertView.getTag();
        } else {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_with_divider, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }
        holder.text.setText(getItem(position) ? "Enabled" : "Disabled");
        return convertView;
    }

    @Override
    public boolean isEnabled(int position) {
        return getItem(position);
    }

    static class ViewHolder {
        TextView text;

        ViewHolder(View view) {
            this.text = (TextView) view.findViewById(R.id.list_item_text);
        }
    }
}
