package com.msoftware.notes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class NoteAdapter extends ArrayAdapter<Notes> {

    public NoteAdapter(Context context, List<Notes> notes)
    {
        super (context, 0, notes);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Notes notes = getItem(position);
        if(convertView == null)
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.note_cell,parent, false);

        TextView title = convertView.findViewById(R.id.etCellTitle);
        TextView dec = convertView.findViewById(R.id.etCellDesc);

        title.setText(notes.getTitle());
        dec.setText(notes.getDescription());
        return convertView;
    }
}
