package tests;

import android.test.ActivityInstrumentationTestCase2;
import android.text.Editable;
import android.widget.EditText;
import android.widget.TextView;

import com.example.andrew.lab3add.Add;
import com.example.andrew.lab3add.R;

/**
 * Created by Andrew on 4/16/2016.
 */
public class Add_JUnit_test extends ActivityInstrumentationTestCase2{
    Add addActivity;

    public Add_JUnit_test() {
        super(Add.class);
    }

    public void test_sum() {
        addActivity = (Add) getActivity();

        EditText num1 = (EditText) addActivity.findViewById(R.id.num1);
        EditText num2 = (EditText) addActivity.findViewById(R.id.num2);

        int a = Integer.parseInt(num1.getText().toString());
        int b = Integer.parseInt(num2.getText().toString());


    }

}
