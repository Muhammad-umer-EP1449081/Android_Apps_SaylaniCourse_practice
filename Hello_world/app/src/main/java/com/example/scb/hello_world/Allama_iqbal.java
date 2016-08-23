package com.example.scb.hello_world;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Allama_iqbal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.description);

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView numberTextView = (TextView) findViewById(R.id.view_big_text);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        numberTextView.setText("Sir Muhammad Iqbal (Urdu: محمد اقبال \u200E) (November 9, 1877 – April 21, 1938), widely known as Allama Iqbal (علامہ اقبال), was a poet, philosopher, and politician, as well as an academic, barrister and scholar[1][2] in British India who is widely regarded as having inspired the Pakistan Movement. He is called the \"Spiritual father of Pakistan\".[3] He is considered one of the most important figures in Urdu literature,[4] with literary work in both the Urdu and Persian languages.[2][4]\n" +
                "Iqbal is admired as a prominent poet by Pakistanis, Indians, Bangladeshis, Sri Lankans and other international scholars of literature.[5][6] Though Iqbal is best known as an eminent poet, he is also a highly acclaimed \"Muslim philosophical thinker of modern times\".[2][6] His first poetry book, Asrar-e-Khudi, appeared in the Persian language in 1915, and other books of poetry include Rumuz-i-Bekhudi, Payam-i-Mashriq and Zabur-i-Ajam. Amongst these, his best known Urdu works are Bang-i-Dara, Bal-i-Jibril, Zarb-i Kalim and a part of Armughan-e-Hijaz.[7] Along with his Urdu and Persian poetry, his Urdu and English lectures and letters have been very influential in cultural, social, religious and political disputes.[7]\n" +
                "In 1922, he was knighted by King George V,[8] granting him the title \"Sir\".[9] While studying law and philosophy in England, Iqbal became a member of the London branch of the All-India Muslim League.[6][7] Later, during the League's December 1930 session, he delivered his most famous presidential speech known as the Allahabad Address in which he pushed for the creation of a Muslim state in Northwest India.[6][7]\n" +
                "In much of South Asia and the Urdu speaking world, Iqbal is regarded as the Shair-e-Mashriq (Urdu: شاعر مشرق\u200E, \"Poet of the East\").[10][11][12] He is also called Mufakkir-e-Pakistan (Urdu: مفکر پاکستان\u200E, \"The Thinker of Pakistan\"), Musawar-e-Pakistan (Urdu: مصور پاکستان\u200E, \"Artist of Pakistan\") and Hakeem-ul-Ummat (Urdu: حکیم الامت\u200E, \"The Sage of the Ummah\"). The Pakistan government officially named him a \"national poet\".[6] His birthday Yōm-e Welādat-e Muḥammad Iqbāl (Urdu: یوم ولادت محمد اقبال\u200E), or Iqbal Day, is a public holiday in Pakistan.[13] In India he is also remembered as the author of the popular song Saare Jahaan Se Achcha.[14]");


        ImageView imageView = (ImageView) findViewById(R.id.view_big_image);

        imageView.setImageResource(R.drawable.allama);
        imageView.setVisibility(View.VISIBLE);



    }
}
