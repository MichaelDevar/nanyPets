package ec.com.lemas.nanypets.adaptador;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;

import ec.com.lemas.nanypets.MainActivity;
import ec.com.lemas.nanypets.R;

public class GaleriaFotosAdaptador extends BaseAdapter {
    private Context mContext;
    public int[] imageArray ={
            R.drawable.imagen10,
            R.drawable.imagen9,
            R.drawable.imagen8,
            R.drawable.imagen7,
            R.drawable.imagen6,
            R.drawable.imagen5,
            R.drawable.imagen3,

    };

    public GaleriaFotosAdaptador(Context mContext) {

        this.mContext = mContext;

    }

    @Override
    public int getCount() {
        return imageArray.length;
    }

    @Override
    public Object getItem(int position) {
        return imageArray[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(imageArray[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(340, 350));

        return imageView;
    }
}
