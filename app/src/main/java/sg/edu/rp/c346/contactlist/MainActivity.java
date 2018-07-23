package sg.edu.rp.c346.contactlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lvContacts;
    ArrayList<Contacts> alContacts;
    CustomAdapter caContacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvContacts = findViewById(R.id.listViewContacts);

        alContacts = new ArrayList<>();

        Contacts c1 = new Contacts("Mary", 65, 65442334);
        Contacts c2 = new Contacts("Ken", 65, 97442437);

        alContacts.add(c1);
        alContacts.add(c2);

        caContacts = new CustomAdapter(this, R.layout.contact_item, alContacts);

        lvContacts.setAdapter(caContacts);
    }
}
