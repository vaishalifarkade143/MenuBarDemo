package com.example.menubardemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class optionMenuBar extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_menu_bar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menubars, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int item_id = item.getItemId();
        if (item_id == R.id.option_one) {
            Toast.makeText(this, "Option one clicked", Toast.LENGTH_SHORT).show();
            return true;
        } else if (item_id == R.id.option_two) {
            Toast.makeText(this, "Opotion Two Clicked", Toast.LENGTH_SHORT).show();
            return true;
        } else if (item_id == R.id.option_three) {
            Toast.makeText(this, "Option Three Clicked", Toast.LENGTH_SHORT).show();
            return true;
        }

 /*switch (item_id)
        {
                case R.id.option_one:
                Toast.makeText(this, "Option one clicked", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.option_two:
                Toast.makeText(this, "Opotion Two Clicked", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.option_three:
                Toast.makeText(this, "Option Three Clicked", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }*/
        return super.onOptionsItemSelected(item);
    }
}