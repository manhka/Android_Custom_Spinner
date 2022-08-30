package manhnguyen.custom.custom_spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
Spinner listCategory;
CategoryItemAdapter categoryItemAdapter;
    List<CategoryItem> list=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listCategory=findViewById(R.id.spinnerCategory);
        categoryItemAdapter=new CategoryItemAdapter(this,R.layout.category_layout,getListCate());
        listCategory.setAdapter(categoryItemAdapter);
        listCategory.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, categoryItemAdapter.getItem(i).getName(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(MainActivity.this, "kkkkkkkkkkk", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private List<CategoryItem> getListCate() {

        list.add(new CategoryItem("Learn C++"));
        list.add(new CategoryItem("Learn PHP"));
        list.add(new CategoryItem("Learn JAVA WEB"));
        list.add(new CategoryItem("Learn ANDROID JAVA"));
        return list;
    }
}