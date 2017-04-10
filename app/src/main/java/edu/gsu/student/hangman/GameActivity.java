package edu.gsu.student.hangman;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static android.view.View.GONE;

public class GameActivity extends BaseActivity{

    String category;
    GameController gc;
    TextView textWord;
    int curImg = 0;

    @BindView(R.id.img_hangman)
    ImageView imgHangman;

    @BindView(R.id.char_panel1)
    LinearLayout char_panel1;

    @BindView(R.id.char_panel2)
    LinearLayout char_panel2;

    @BindView(R.id.char_panel3)
    LinearLayout char_panel3;

    @BindView(R.id.char_panel4)
    LinearLayout char_panel4;

    @BindView(R.id.gameover)
    RelativeLayout gameoverPanel;

    @BindView(R.id.gameover_text)
    TextView gameoverText;

    @OnClick(R.id.button_playAgain)
    public void playAgain(){
        toActivity(MainActivity.class);
    }

    @BindView(R.id.button_gameA)
    Button buttonA;

    @OnClick(R.id.button_gameA)
    public void ClickA(){
        buttonA.setEnabled(false);
        processView(gc.letterSelected("A"));
    }

    @BindView(R.id.button_gameB)
    Button buttonB;

    @OnClick(R.id.button_gameB)
    public void ClickB(){
        buttonB.setEnabled(false);
        processView(gc.letterSelected("B"));
    }

    @BindView(R.id.button_gameC)
    Button buttonC;

    @OnClick(R.id.button_gameC)
    public void ClickC(){
        buttonC.setEnabled(false);
        processView(gc.letterSelected("C"));
    }

    @BindView(R.id.button_gameD)
    Button buttonD;

    @OnClick(R.id.button_gameD)
    public void ClickD(){
        buttonD.setEnabled(false);
        processView(gc.letterSelected("D"));
    }

    @BindView(R.id.button_gameE)
    Button buttonE;

    @OnClick(R.id.button_gameE)
    public void ClickE(){
        buttonE.setEnabled(false);
        processView(gc.letterSelected("E"));
    }

    @BindView(R.id.button_gameF)
    Button buttonF;

    @OnClick(R.id.button_gameF)
    public void ClickF(){
        buttonF.setEnabled(false);
        processView(gc.letterSelected("F"));
    }

    @BindView(R.id.button_gameG)
    Button buttonG;

    @OnClick(R.id.button_gameG)
    public void ClickG(){
        buttonG.setEnabled(false);
        processView(gc.letterSelected("G"));
    }

    @BindView(R.id.button_gameH)
    Button buttonH;

    @OnClick(R.id.button_gameH)
    public void ClickH(){
        buttonH.setEnabled(false);
        processView(gc.letterSelected("H"));
    }

    @BindView(R.id.button_gameI)
    Button buttonI;

    @OnClick(R.id.button_gameI)
    public void ClickI(){
        buttonI.setEnabled(false);
        processView(gc.letterSelected("I"));
    }

    @BindView(R.id.button_gameJ)
    Button buttonJ;

    @OnClick(R.id.button_gameJ)
    public void ClickJ(){
        buttonJ.setEnabled(false);
        processView(gc.letterSelected("J"));
    }

    @BindView(R.id.button_gameK)
    Button buttonK;

    @OnClick(R.id.button_gameK)
    public void ClickK(){
        buttonK.setEnabled(false);
        processView(gc.letterSelected("K"));
    }

    @BindView(R.id.button_gameL)
    Button buttonL;

    @OnClick(R.id.button_gameL)
    public void ClickL(){
        buttonL.setEnabled(false);
        processView(gc.letterSelected("L"));
    }

    @BindView(R.id.button_gameM)
    Button buttonM;

    @OnClick(R.id.button_gameM)
    public void ClickM(){
        buttonM.setEnabled(false);
        processView(gc.letterSelected("M"));
    }

    @BindView(R.id.button_gameN)
    Button buttonN;

    @OnClick(R.id.button_gameN)
    public void ClickN(){
        buttonN.setEnabled(false);
        processView(gc.letterSelected("N"));
    }

    @BindView(R.id.button_gameO)
    Button buttonO;

    @OnClick(R.id.button_gameO)
    public void ClickO(){
        buttonO.setEnabled(false);
        processView(gc.letterSelected("O"));
    }

    @BindView(R.id.button_gameP)
    Button buttonP;

    @OnClick(R.id.button_gameP)
    public void ClickP(){
        buttonP.setEnabled(false);
        processView(gc.letterSelected("P"));
    }

    @BindView(R.id.button_gameQ)
    Button buttonQ;

    @OnClick(R.id.button_gameQ)
    public void ClickQ(){
        buttonQ.setEnabled(false);
        processView(gc.letterSelected("Q"));
    }

    @BindView(R.id.button_gameR)
    Button buttonR;

    @OnClick(R.id.button_gameR)
    public void ClickR(){
        buttonR.setEnabled(false);
        processView(gc.letterSelected("R"));
    }

    @BindView(R.id.button_gameS)
    Button buttonS;

    @OnClick(R.id.button_gameS)
    public void ClickS(){
        buttonS.setEnabled(false);
        processView(gc.letterSelected("S"));
    }

    @BindView(R.id.button_gameT)
    Button buttonT;

    @OnClick(R.id.button_gameT)
    public void ClickT(){
        buttonT.setEnabled(false);
        processView(gc.letterSelected("T"));
    }

    @BindView(R.id.button_gameU)
    Button buttonU;

    @OnClick(R.id.button_gameU)
    public void ClickU(){
        buttonU.setEnabled(false);
        processView(gc.letterSelected("U"));
    }

    @BindView(R.id.button_gameV)
    Button buttonV;

    @OnClick(R.id.button_gameV)
    public void ClickV(){
        buttonV.setEnabled(false);
        processView(gc.letterSelected("V"));
    }

    @BindView(R.id.button_gameW)
    Button buttonW;

    @OnClick(R.id.button_gameW)
    public void ClickW(){
        buttonW.setEnabled(false);
        processView(gc.letterSelected("W"));
    }

    @BindView(R.id.button_gameX)
    Button buttonX;

    @OnClick(R.id.button_gameX)
    public void ClickX(){
        buttonX.setEnabled(false);
        processView(gc.letterSelected("X"));
    }

    @BindView(R.id.button_gameY)
    Button buttonY;

    @OnClick(R.id.button_gameY)
    public void ClickY(){
        buttonY.setEnabled(false);
        processView(gc.letterSelected("Y"));
    }

    @BindView(R.id.button_gameZ)
    Button buttonZ;

    @OnClick(R.id.button_gameZ)
    public void ClickZ(){
        buttonZ.setEnabled(false);
        processView(gc.letterSelected("Z"));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        ButterKnife.bind(this);

        Bundle extras = getIntent().getExtras();
        if(extras != null){
            category = extras.getString("Category");
        }

        gc = new GameController(this, category);
        toastShort(gc.getWord());

        textWord = (TextView) findViewById(R.id.text_word);
        textWord.setText(gc.getGameWord());
    }

    private void processView(boolean foundWord){
        if(!foundWord){
            if(curImg == 5){
                char_panel1.setVisibility(GONE);
                char_panel2.setVisibility(GONE);
                char_panel3.setVisibility(GONE);
                char_panel4.setVisibility(GONE);
                gameoverText.setText("Game Over!\n" + gc.getWord());
                gameoverPanel.setVisibility(View.VISIBLE);
            }
            if(curImg < 6) {
                curImg++;
                String uri = "drawable/hangman" + curImg;
                int imageResource = getResources().getIdentifier(uri, null, getPackageName());
                imgHangman.setImageResource(imageResource);
            }
        }
        if(gc.getWin()){
            char_panel1.setVisibility(GONE);
            char_panel2.setVisibility(GONE);
            char_panel3.setVisibility(GONE);
            char_panel4.setVisibility(GONE);
            gameoverPanel.setVisibility(View.VISIBLE);
        }

        textWord.setText(gc.getGameWord());
    }
}
