package seekbar.android.myapplication;

import android.app.ActivityManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by yijin on 8/26/16.
 */
public class ItemDetailActivity extends AppCompatActivity {

    public Button mButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_general);
        TextView textView = (TextView) findViewById(R.id.title);
        textView.setText("ItemDetailActivity");
        mButton = (Button) findViewById(R.id.newActiivityButton);
        mButton.setText("User Profile Activity");
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ItemDetailActivity.this, UserProfileActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(intent);
            }
        });
    }

//    @Override
//    public void finish() {
//        super.finish();
//        ActivityManager tasksManager = (ActivityManager) getSystemService(ACTIVITY_SERVICE);
//        tasksManager.moveTaskToFront(getTaskId(), ActivityManager.MOVE_TASK_NO_USER_ACTION);
//    }
}
