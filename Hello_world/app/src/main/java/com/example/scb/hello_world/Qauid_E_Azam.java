package com.example.scb.hello_world;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Qauid_E_Azam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.description);

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView numberTextView = (TextView) findViewById(R.id.view_big_text);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        numberTextView.setText("Muhammad Ali Jinnah (Urdu: محمد علی جناح\u200E ALA-LC: Muḥammad ʿAlī Jināḥ, born Mahomedali Jinnahbhai; 25 December 1876 – 11 September 1948) was a lawyer, politician, and the founder of Pakistan.[3] Jinnah served as leader of the All-India Muslim League from 1913 until Pakistan's creation on 14 August 1947, and then as Pakistan's first Governor-General until his death. He is revered in Pakistan as Quaid-i-Azam (Urdu: قائد اعظم\u200E; Great Leader) and Baba-i-Qaum (Urdu: بابائے قوم\u200E; Father of the Nation). His birthday is observed as a national holiday.[4][5]\n" +
                "Born in Karachi and trained as a barrister at Lincoln's Inn in London, Jinnah rose to prominence in the Indian National Congress in the first two decades of the 20th century. In these early years of his political career, Jinnah advocated Hindu–Muslim unity, helping to shape the 1916 Lucknow Pact between the Congress and the All-India Muslim League, in which Jinnah had also become prominent. Jinnah became a key leader in the All India Home Rule League, and proposed a fourteen-point constitutional reform plan to safeguard the political rights of Muslims. In 1920, however, Jinnah resigned from the Congress when it agreed to follow a campaign of satyagraha, or non-violent resistance, advocated by Mohandas Gandhi.\n" +
                "By 1940, Jinnah had come to believe that Indian Muslims should have their own state. In that year, the Muslim League, led by Jinnah, passed the Lahore Resolution, demanding a separate nation. During the Second World War, the League gained strength while leaders of the Congress were imprisoned, and in the elections held shortly after the war, it won most of the seats reserved for Muslims. Ultimately, the Congress and the Muslim League could not reach a power-sharing formula for a united India, leading all parties to agree to separate independence of a predominantly Hindu India, and for a Muslim-majority state, to be called Pakistan.\n" +
                "As the first Governor-General of Pakistan, Jinnah worked to establish the new nation's government and policies, and to aid the millions of Muslim migrants who had emigrated from the new nation of India to Pakistan after independence, personally supervising the establishment of refugee camps. Jinnah died at age 71 in September 1948, just over a year after Pakistan gained independence from the United Kingdom. He left a deep and respected legacy in Pakistan. According to his biographer, Stanley Wolpert, he remains Pakistan's greatest leader.");
        ImageView imageView = (ImageView) findViewById(R.id.view_big_image);

        imageView.setImageResource(R.drawable.qauid);
        imageView.setVisibility(View.VISIBLE);
    }
}
