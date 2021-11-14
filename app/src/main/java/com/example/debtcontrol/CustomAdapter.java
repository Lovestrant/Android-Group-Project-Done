//package com.example.debtcontrol;
//
//import android.app.AlertDialog;
//import android.content.Context;
//import android.content.DialogInterface;
//import android.content.Intent;
//import android.graphics.Color;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.Button;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import java.util.ArrayList;
//
//public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {
//
//    Context context;
//    ArrayList name;
//    ArrayList list;
//    ArrayList total;
//    ArrayList id;
//
//
//    public CustomAdapter(Context context, ArrayList name, ArrayList list, ArrayList total, ArrayList<String> id) {
//        this.context = context;
//        this.name = name;
//        this.list = list;
//        this.id = id;
//        this.total = total;
//    }
//
//    @NonNull
//    @Override
//    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        LayoutInflater inflater = LayoutInflater.from(context);
//       View view = inflater.inflate(R.layout.single_row, parent,false);
//
//        return new MyViewHolder(view).linkAdapter(this);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
//        holder.names.setText(String.valueOf(name.get(position)));
//        holder.lists.setText(String.valueOf(list.get(position)));
//        holder.totals.setText(String.valueOf(total.get(position)));
//
//
//    }
//
//    @Override
//    public int getItemCount() {
//        return name.size();
//    }
//
//    public class MyViewHolder extends RecyclerView.ViewHolder {
//        TextView names,lists,totals; Button delete,edit;
//        private CustomAdapter adapter;
//
//        public MyViewHolder(@NonNull View itemView) {
//            super(itemView);
//
//
//            names = (TextView)itemView.findViewById(R.id.name);
//            lists = (TextView)itemView.findViewById(R.id.list);
//            totals = (TextView)itemView.findViewById(R.id.total);
//           delete = (Button)itemView.findViewById(R.id.Delete);
//           edit = (Button)itemView.findViewById(R.id.Edit);
//
//           //set onclick listener to the delete btn
//            delete.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                   // adapter.id.remove(getAdapterPosition());
//                  // adapter.notifyItemRemoved(getAdapterPosition());
//                   // Intent intent = new Intent(context, Delete.class);
//                    //intent.putExtra("id", id);
//                   // context.startActivity(intent);
//
//                    AlertDialog.Builder builder = new AlertDialog.Builder(context);
//                    builder.setTitle("Delete Confirmation!");
//                    builder.setMessage("Confirm Delete...");
//
//                    builder.setCancelable(false);
//                    builder.setNegativeButton("no",null);
//                    builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
//                        @Override
//                        public void onClick(DialogInterface dialog, int which) {
//                            DatabaseHelper dbHelper = new DatabaseHelper(context);
//                            Boolean result = dbHelper.deleteUserdata(id.toString());
//                            if(result == true) {
//                                Toast.makeText(context, "Delete Success", Toast.LENGTH_SHORT).show();
//                            }else{
//                                Toast.makeText(context, "Delete Failed", Toast.LENGTH_SHORT).show();
//                            }
//                        }
//                    });
//                    builder.show();
//
//                }
//            });
//
//            //set onclick listener to edit btn
//            edit.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Intent intent = new Intent(context, Edit.class);
//                    intent.putExtra("id", id);
//                    context.startActivity(intent);
//                }
//            });
//            }
//
//
//        //method to link adapter
//        public MyViewHolder linkAdapter(CustomAdapter adapter) {
//            this.adapter = adapter;
//            return this;
//        }
//    }
//}
