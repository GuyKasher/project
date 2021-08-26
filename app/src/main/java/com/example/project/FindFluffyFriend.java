package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;


public class FindFluffyFriend extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

//    public dataHolder holder = null;
//todo decide how to handle data

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fluffy_friends);
        FirebaseFirestore db = FirebaseFirestore.getInstance();

        // calling the action bar
        ActionBar actionBar = getSupportActionBar();

        // showing the back button in action bar
        actionBar.setDisplayHomeAsUpEnabled(true);


        Button settingButton = findViewById(R.id.setting);
//        Button backButton = findViewById(R.id.back);//added a default back button so no need for this back
        Button friendsButton = findViewById(R.id.friends);
        Button areaButton = findViewById(R.id.area);

        settingButton.setVisibility(View.VISIBLE);
//        backButton.setVisibility(View.VISIBLE);
        friendsButton.setVisibility(View.VISIBLE);
        areaButton.setVisibility(View.VISIBLE);

        settingButton.setOnClickListener(v -> {
            //todo add conections to setting code

        });
//        backButton.setOnClickListener(v -> {
//            finish();
//
//        });
        friendsButton.setOnClickListener(v -> {

            Intent intent = new Intent(this, FriendsList.class);
            startActivity(intent);
//            adapter = new Adapter(holder);
//
//            RecyclerView recyclerView = findViewById(R.id.recyclerTodoItemsList);
//            recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false));
//            recyclerView.setAdapter(adapter);

//            if i choose to change to a new class
//            Intent friendList = new Intent(FindFluffyFriend.this,InProgressActivity.class);
//            startActivity(friendList);
//            finish();


        });
        areaButton.setOnClickListener(v -> {
            //todo add conections to Kashers code

        });

//        if (holder == null) {
//            // remove and make static
//            holder = OrderSaverApp.getInstance().getDatabase();
//        }
//        cur_order = holder.cur_items;
//        Spinner Pickle_num = findViewById(R.id.pickle_spinner);
//
//        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
//                R.array.nums, android.R.layout.simple_spinner_item);
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        Pickle_num.setAdapter(adapter);
//        Pickle_num.setOnItemSelectedListener(this);
//        FloatingActionButton doneEdit = findViewById(R.id.finishEdit);
//        Pickle_num.setSelection(holder.cur_items.Pickles);




    }
    //back button
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if ( id == android.R.id.home ) {
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
