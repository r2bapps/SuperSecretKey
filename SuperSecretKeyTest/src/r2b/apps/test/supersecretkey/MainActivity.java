package r2b.apps.test.supersecretkey;

import r2b.apps.lib.supersecretkey.SuperSecretKey;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_main);   
    }
     
    @Override
	protected void onResume() {
		super.onResume();
		
		init();
	}

	protected void init() {
        TextView tvKey = (TextView) findViewById(R.id.tvKey);
        tvKey.setText((new SuperSecretKey()).get());
    }
}
