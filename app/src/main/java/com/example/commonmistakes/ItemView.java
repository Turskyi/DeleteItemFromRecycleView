package com.example.commonmistakes;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.util.AttributeSet;
import android.view.ViewGroup;

public class ItemView extends ConstraintLayout {
    public ItemView(Context context) {
        super(context);
        inflateLayout(context);
    }

    public ItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        inflateLayout(context);
    }

    private void inflateLayout(Context context) {
        inflate(context, R.layout.view_item, this);
    }

    @Override
    public void setLayoutParams(ViewGroup.LayoutParams params) {

        params.width = ViewGroup.LayoutParams.MATCH_PARENT;
        params.height = ViewGroup.LayoutParams.WRAP_CONTENT;
        super.setLayoutParams(params);
    }
}
