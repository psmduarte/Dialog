package dialog.cursoandroid.com.dialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button botao;
    private AlertDialog.Builder dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao = findViewById(R.id.botaoId);
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //criar alert dialog
                dialog = new AlertDialog.Builder(MainActivity.this);

                //configurar titulo
                dialog.setTitle("Titulo Dialog");

                //configurar mensagem
                dialog.setMessage("Mensagem da Dialog");

                //Cancelar dialog
                dialog.setCancelable(true);

                //colocar icone
                dialog.setIcon(android.R.drawable.star_on);

                //configurar botão não
                dialog.setNegativeButton("Não",
                        new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(MainActivity.this, "Pressionado Botão Não", Toast.LENGTH_SHORT).show();

                    }
                });
                //configurar botão sim
                dialog.setPositiveButton("Sim",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(MainActivity.this,"Pressionado Botão Sim",Toast.LENGTH_SHORT).show();
                            }
                        });

                dialog.create();
                dialog.show();

            }
        });
    }
}
