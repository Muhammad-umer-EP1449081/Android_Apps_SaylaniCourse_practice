package com.example.scb.hello_world;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Sir_syed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.description);

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView numberTextView = (TextView) findViewById(R.id.view_big_text);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        numberTextView.setText("Syed Ahmad bin Muttaqi Khan CSI (Urdu: سر سید احمد خان\u200E; 17 October 1817 – 27 March 1898), commonly known as Sir Syed, was an Indian Muslim pragmatist,[1] Islamic modernist,[2][3] philosopher and social activist of nineteenth century India. He worked for the British East India Company and was one of the founders of the Aligarh Muslim University. In 1842, Mughal Emperor Bahadur Shah Zafar–II conferred upon Sir Syed the title of Javad-ud Daulah, maintaining the title originally conferred upon Sir Syed's grandfather Syed Hadi Jawwad bin Imaduddin Khan by Emperor Shah Alam II around the middle of the 18th century.\n" +
                "In addition, the Emperor added the title of Arif Jang. The conferment of these titles was symbolic of Sir Syed's incorporation into the nobility of Delhi.[4]\n" +
                "Born into nobility, Sir Syed earned a reputation as a distinguished scholar while working as a jurist for the British East India Company's rule in India. During the Indian Rebellion of 1857, he remained loyal to the British Empire and was noted for his actions in saving European lives.[5] After the rebellion, he penned the booklet The Causes of the Indian Mutiny – a daring critique, at the time, of British policies that he blamed for causing the revolt. Believing that the future of Muslims was threatened by the rigidity of their orthodox outlook, Sir Syed began promoting Western–style scientific education by founding modern schools and journals and organising Muslim entrepreneurs. Towards this goal, Sir Syed founded Muhammadan Anglo-Oriental College in 1875 with the aim of promoting social, scientific, and economic development of Indian Muslims which later developed into the famous Aligarh Muslim University.\n" +
                "Influential Hindu and Muslim politicians of his time viewed Sir Syed with great suspicion, since he called upon Muslims to loyally serve the British Empire. He denounced nationalist organisations such as the Indian Congress for giving only token representation to the Indian Muslim community. Sir Syed promoted the adoption of Urdu as the lingua franca of all Indian Muslims, and mentored a rising generation of Muslim politicians and entrepreneurs. Prior to the Hindi–Urdu controversy, he was interested in the education of both Muslims and Hindus, and visualised India as a \"beautiful bride, whose one eye was Hindu and, the other, Muslim\". As a result of this view, he was regarded as a reformer and nationalist leader.");
        ImageView imageView = (ImageView) findViewById(R.id.view_big_image);

        imageView.setImageResource(R.drawable.sirsyed);
        imageView.setVisibility(View.VISIBLE);
    }
}
