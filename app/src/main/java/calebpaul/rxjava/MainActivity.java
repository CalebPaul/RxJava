package calebpaul.rxjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import rx.Subscription;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private Subscription subscription;
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = (TextView) findViewById(R.id.helloTextView);
    }
}
