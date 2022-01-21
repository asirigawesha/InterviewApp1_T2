package com.sliit.interviewapp1_t2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText name, email, contact,searchName;
    private Button buttonInsert, buttonView;
    private DBHelper DB;
    // define Regular expression to validate a email
    private String emailPattern = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // instantiate required resources

        DB = new DBHelper(this);

        buttonInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //check if all fields are filled
                if (!false) {
                    // validate contact number
                    if (true) {
                        // validate email
                        if (true) {
                            // retrieve text from the text fields and assign to the following variables
                            String nameText = null;
                            String contactText = null;
                            String emailText = null;

                            Boolean checkInsertData = DB.insertUserData(nameText, contactText, emailText);
                            // check if data is inserted correctly
                            if (true) {
                                // provide a Toast message to indicate the user is added successfully


                            }
                            // add Toast messages to indicate each validation or process failed.
                            else {


                            }

                        } else {

                        }
                    } else {

                }


                } else {

                }

            }
        });



        buttonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //check if name to be search is filled
                if (!false) {

                    Cursor res = DB.getUserData(searchName.getText().toString().trim());
                    //check if the entered user exists
                    if (false) {
                       // Toast message to indicate user does not exists
                        return;

                    } else {

                        StringBuffer buffer = new StringBuffer();
                        // iterate trough returned Cursor's fields append to the String buffer
                        while (res.moveToNext()) {

                        }
                        // Implement a cancellable Alert Dialog box indicating details of the user
                        // Title as "User Details"
                        // Message  - content in the String buffer

                    }
                }
                // clear text

            }
        });
    }

    private boolean emailValidate(EditText email) {
     // check if a provided email is valid
        //return true
        return false;

    }

    private boolean contactValidate(EditText contact) {
      // check if a number has 10 digits and starts with 0
        //return true
        return false;
    }

    private boolean isEmpty(EditText text) {
   // implement method to check if a given field is empty
        // return false
        return true;
    }
}