package com.msoftware.notes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView notesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initWidget();
        setNoteAdapter();
    }

    public void initWidget()
    {
        notesList = findViewById(R.id.listView);
    }

    public void setNoteAdapter ()
    {
        NoteAdapter noteAdapter = new NoteAdapter(getApplicationContext(),Notes.notesArrayList );
        notesList.setAdapter(noteAdapter);
    }

    public void newNote (View view)
    {
        Intent newNoteIntent = new Intent(this, NoteDetails.class);
        startActivity(newNoteIntent);
    }
}