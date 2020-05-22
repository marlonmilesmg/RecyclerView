package www.technoextreme.co.zw.recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyHolder extends RecyclerView.ViewHolder {

    ImageView mImageView;
    TextView mTitle, mAnswer;

    public MyHolder(@NonNull View itemView) {
        super(itemView);

        this.mImageView = itemView.findViewById(R.id.imageQsn);
        this.mTitle = itemView.findViewById(R.id.question);
        this.mAnswer = itemView.findViewById(R.id.response);

    }
}
