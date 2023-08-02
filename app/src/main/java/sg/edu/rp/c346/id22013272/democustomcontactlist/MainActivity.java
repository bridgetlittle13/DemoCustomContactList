package sg.edu.rp.c346.id22013272.democustomcontactlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvContact;
    ArrayList<Contact> alcontactList;
    CustomAdapter caContact;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvContact = findViewById(R.id.listViewContacts);
        
        alcontactList= new ArrayList<>();
        //Contact item1 = new Contact("Mary", 65, 1234567, 'F');
        //Contact item2 = new Contact("Ken", 65, 7654321, 'M');
        Contact item1 = new Contact("Mary", 65, 65442334, 'F');
        alcontactList.add(item1);

        Contact item2 = new Contact("Ken", 65, 97442437, 'M');
        alcontactList.add(item2);
//        alcontactList.add(item1);
//        alcontactList.add(item2);

        caContact= new CustomAdapter(this,R.layout.row, alcontactList);
        lvContact.setAdapter(caContact);
    }
}