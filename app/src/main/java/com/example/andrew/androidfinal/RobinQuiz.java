package com.example.andrew.androidfinal;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;


public class RobinQuiz extends Activity {
    ListView listViewObject;

    ArrayList<String> quizLines = new ArrayList<String>();

    SearchDatabaseHelper searchDatabase;
    EditText javaEditText;
    Button multiple, trueFalse, numeric, infoButton;
    SQLiteDatabase databaseDb;
    Cursor cursor;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_robin_quiz);
        infoButton = findViewById(R.id.backR);
        multiple = findViewById(R.id.multipleR);
        trueFalse = findViewById(R.id.trueFalseR);
        numeric = findViewById(R.id.numericR);
        // TextView message = (TextView) result.findViewById(R.id.textView);

//        Snackbar snackbar = Snackbar.make(findViewById(R.id.textView), "Quiz data", Snackbar.LENGTH_LONG);

  //      snackbar.show();
//        snackbar.setAction(R.string.AndrewStopSearchSnackGo, (t) -> {
//            Intent intent = new Intent(RobinQuiz.this, RobinQuiz.class);
//            intent.putExtra("StopNumber", message.getText());
//            startActivity(intent);
//
//        });

//        AlertDialog.Builder alertBuilder = new AlertDialog.Builder(getContext());
//        alertBuilder.setMessage("Stop Number: "+message.getText())
//                .setPositiveButton(R.string.Continue, new DialogInterface.OnClickListener() {
//                    public void onClick(DialogInterface dialog, int id) {
//                        Intent intent = new Intent(RobinQuiz.this, RobinQuiz.class);
//                        intent.putExtra("StopNumber", message.getText());
//                        startActivity(intent);
//                    }
//                })
//                .setNegativeButton(R.string.Delete, new DialogInterface.OnClickListener() {
//                    public void onClick(DialogInterface dialog, int id) {
//                        Toast toast = Toast.makeText(RobinQuiz.this, "Placeholder for Delete", Toast.LENGTH_LONG);
//                        toast.show();
//                    }
//                });
//
//
//        AlertDialog alert = alertBuilder.create();
//        alert.show();

//    });
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(RobinQuiz.this, "I was clicked", Toast.LENGTH_LONG).show();
//
//            }
//        });
//    }


    }
}