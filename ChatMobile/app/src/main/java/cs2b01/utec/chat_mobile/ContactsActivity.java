package cs2b01.utec.chat_mobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ContactsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);
        int user_id = getIntent().getExtras().getInt("user_id");
        String username = getIntent().getExtras().getString("username");
        setTitle(username);
    }
}
