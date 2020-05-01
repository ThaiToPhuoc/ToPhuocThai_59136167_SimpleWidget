package vn.edu.ntu.phuocthai.tophuocthai_59136167_simplewidget;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ten, ngaysinh, sothich;
    Button xacnhan;
    RadioGroup gioitinh;
    CheckBox xemphim, nghenhac, cafe, onha, vaobep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ten = findViewById(R.id.name);
        ngaysinh = findViewById(R.id.birthdate);
        sothich = findViewById(R.id.khac);

        //-------------checkbox---------------
        xemphim = findViewById(R.id.xemphim);
        nghenhac = findViewById(R.id.nghenhac);
        cafe = findViewById(R.id.cafe);
        onha = findViewById(R.id.onha);
        vaobep =  findViewById(R.id.vaobep);
        //-----------------------------------
        gioitinh = findViewById(R.id.gioitinh);
        xacnhan =  findViewById(R.id.button);

        xacnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str ="";
                str+="Tên bạn: "+ ten.getText().toString();
                str+="\nNgày sinh: "+ ngaysinh.getText().toString();

                switch (gioitinh.getCheckedRadioButtonId()){
                    case R.id.nam: str+="\nGiới tính : nam"; break;
                    case R.id.nu: str+="\nGiới tính : nữ"; break;
                }

                str+="\nSở thích: ";

                if(xemphim.isChecked()){
                    str = str+ xemphim.getText().toString()+"; ";
                }
                if(nghenhac.isChecked()){
                    str = str+ nghenhac.getText().toString()+"; ";
                }
                if(cafe.isChecked()){
                    str = str+ cafe.getText().toString()+"; ";
                }
                if(onha.isChecked()){
                    str = str+ onha.getText().toString()+"; ";
                }
                if(vaobep.isChecked()){
                    str = str+ vaobep.getText().toString();
                }

                str+= sothich.getText()+".";
                Toast.makeText(getApplicationContext(),str,Toast.LENGTH_LONG).show();
            }
        });
    }
}
