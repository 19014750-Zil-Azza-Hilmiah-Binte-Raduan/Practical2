//Zil Azza 19014750

package sg.edu.rp.c346.id19014750.practical2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView location, desc, info;
    ImageView pic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        location = findViewById(R.id.textViewLocation);
        pic = findViewById(R.id.imageViewLoc);
        desc = findViewById(R.id.textViewDesc);
        info = findViewById(R.id.textViewInfo);

        Intent intentReceived = getIntent();
        String btnSelected = intentReceived.getStringExtra("select");

        registerForContextMenu(desc);

        if(btnSelected.equalsIgnoreCase("Loc1")){
            location.setText(getString(R.string.location1));
            pic.setImageResource(R.drawable.location1);
            desc.setText(R.string.desc1);
            info.setText(R.string.more_info);

            info.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intentWeb = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.url1)));
                    startActivity(intentWeb);
                }
            });
        }
        else if(btnSelected.equalsIgnoreCase("Loc2")){
            location.setText(getString(R.string.location2));
            pic.setImageResource(R.drawable.location2);
            desc.setText(R.string.desc2);
            info.setText(R.string.more_info);

            info.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intentWeb = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.url2)));
                    startActivity(intentWeb);
                }
            });
        }
        else if(btnSelected.equalsIgnoreCase("Loc3")){
            location.setText(getString(R.string.location3));
            pic.setImageResource(R.drawable.location3);
            desc.setText(R.string.desc3);
            info.setText(R.string.more_info);

            info.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intentWeb = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.url3)));
                    startActivity(intentWeb);
                }
            });
        }
        else if(btnSelected.equalsIgnoreCase("Loc4")){
            location.setText(getString(R.string.location4));
            pic.setImageResource(R.drawable.location4);
            desc.setText(R.string.desc4);
            info.setText(R.string.more_info);

            info.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intentWeb = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.url4)));
                    startActivity(intentWeb);
                }
            });
        }
        else if(btnSelected.equalsIgnoreCase("Loc5")){
            location.setText(getString(R.string.location5));
            pic.setImageResource(R.drawable.location5);
            desc.setText(R.string.desc5);
            info.setText(R.string.more_info);

            info.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intentWeb = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.url5)));
                    startActivity(intentWeb);
                }
            });
        }
        else if(btnSelected.equalsIgnoreCase("Loc6")){
            location.setText(getString(R.string.location6));
            pic.setImageResource(R.drawable.location6);
            desc.setText(R.string.desc6);
            info.setText(R.string.more_info);

            info.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intentWeb = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.url6)));
                    startActivity(intentWeb);
                }
            });
        }

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.menu_lang, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        int id = item.getItemId();

        Intent intentReceived = getIntent();
        String btnSelected = intentReceived.getStringExtra("select");

        if(btnSelected.equalsIgnoreCase("Loc1")){
            if(id == R.id.EnglishSelection){
                desc.setText(getString(R.string.desc1));
                info.setText(getString(R.string.more_info));
                return true;
            }
            else if(id == R.id.MalaySelection){
                desc.setText(getString(R.string.malayDesc1));
                info.setText(getString(R.string.malay_info));
                return true;
            }
        }
        else if(btnSelected.equalsIgnoreCase("Loc2")){
            if(id == R.id.EnglishSelection){
                desc.setText(getString(R.string.desc2));
                info.setText(getString(R.string.more_info));
                return true;
            }
            else if(id == R.id.MalaySelection){
                desc.setText(getString(R.string.malayDesc2));
                info.setText(getString(R.string.malay_info));
                return true;
            }
        }
        else if(btnSelected.equalsIgnoreCase("Loc3")){
            if(id == R.id.EnglishSelection){
                desc.setText(getString(R.string.desc3));
                info.setText(getString(R.string.more_info));
                return true;
            }
            else if(id == R.id.MalaySelection){
                desc.setText(getString(R.string.malayDesc3));
                info.setText(getString(R.string.malay_info));
                return true;
            }
        }
        else if(btnSelected.equalsIgnoreCase("Loc4")){
            if(id == R.id.EnglishSelection){
                desc.setText(getString(R.string.desc4));
                info.setText(getString(R.string.more_info));
                return true;
            }
            else if(id == R.id.MalaySelection){
                desc.setText(getString(R.string.malayDesc4));
                info.setText(getString(R.string.malay_info));
                return true;
            }
        }
        else if(btnSelected.equalsIgnoreCase("Loc5")){
            if(id == R.id.EnglishSelection){
                desc.setText(getString(R.string.desc5));
                info.setText(getString(R.string.more_info));
                return true;
            }
            else if(id == R.id.MalaySelection){
                desc.setText(getString(R.string.malayDesc5));
                info.setText(getString(R.string.malay_info));
                return true;
            }
        }
        else if(btnSelected.equalsIgnoreCase("Loc6")){
            if(id == R.id.EnglishSelection){
                desc.setText(getString(R.string.desc6));
                info.setText(getString(R.string.more_info));
                return true;
            }
            else if(id == R.id.MalaySelection){
                desc.setText(getString(R.string.malayDesc6));
                info.setText(getString(R.string.malay_info));
                return true;
            }
        }

        return super.onContextItemSelected(item);
    }
}