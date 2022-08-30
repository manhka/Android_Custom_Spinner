package manhnguyen.custom.custom_spinner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class CategoryItemAdapter extends ArrayAdapter<CategoryItem> {
    public CategoryItemAdapter(@NonNull Context context, int resource, @NonNull List<CategoryItem> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView= LayoutInflater.from(parent.getContext()).inflate(R.layout.category_layout,parent,false);
        TextView txtCategory=convertView.findViewById(R.id.txtCategory);
        CategoryItem categoryItem=this.getItem(position);
        if (categoryItem!=null){
            txtCategory.setText(categoryItem.getName());
        }
        return convertView;    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView= LayoutInflater.from(parent.getContext()).inflate(R.layout.itemselector_layout,parent,false);
        TextView txtItem=convertView.findViewById(R.id.txtItemSelector);
        CategoryItem categoryItem=this.getItem(position);
        if (categoryItem!=null){
            txtItem.setText(categoryItem.getName());
        }
        return convertView;
    }
}
