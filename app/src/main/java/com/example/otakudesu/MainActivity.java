package com.example.otakudesu;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String mJudul[] = {"One Piece",
            "Sono Bisque Doll wa Koi wo Suru",
            "Tensai Ouji no Akaji Kokka Saisei Jutsu",
            "Ousama Ranking",
            "Fantasy Bishoujo Juniku Ojisan to",
            "Shingeki no Kyojin",
            "Sabikui Bisco",
            "Bleach",
            "Kenja no Deshi wo Nanoru Kenja",
            "Black Clover"};

    String mDetail[] = {"Gold Roger was known as the Pirate King, the strongest and most infamous being to have sailed the Grand Line. The capture and death of Roger by the World Government brought a change throughout the world. His last words before his death revealed the location of the greatest treasure in the world, One Piece. It was this revelation that brought about the Grand Age of Pirates, men who dreamed of finding One Piece (which promises an unlimited amount of riches and fame), and quite possibly the most coveted of titles for the person who found it, the title of the Pirate King.",
            "High schooler Wakana Gojou cares about one thing: making Hina dolls. With nobody to share his obsession, he has trouble finding friends—or even holding conversation. But after the school’s most popular girl, Marin Kitagawa, reveals a secret of her own, he discovers a new purpose for his sewing skills. Together, they’ll make her cosplay dreams come true!",
            "Once upon a time in a far away land there lived a prince, a genius prince. The genius prince fought alongside his people and led them to a great many triumphs. However, truth be told, he just wants to let everything go and live in tranquility.",
            "Unable to hear, speak, or wield a sword, Prince Bojji doesn’t seem like a typical heir to the throne—and his kingdom agrees. But his fateful encounter with Kage, a shadow on the ground, gives him his first true friend. The two set off on a grand adventure and, together, form a bond that can overcome any obstacle...even being king.",
            "Childhood friends Tachibana Hinata and Jinguuji Tsukasa were living the everyday life of office workers. Then, on the way home from a mixer, they were sent flying into another world by a mysterious being. Once there, Jinguuji sees his best friend has been turned into a beautiful blonde-haired, blue-eyed girl...?!",
            "The war for Paradis zeroes in on Shiganshina just as Jaegerists have seized control. After taking a huge blow from a surprise attack led by Eren, Marley swiftly acts to return the favor. With Zeke’s true plan revealed and a military forced under new rule, this battle might be fought on two fronts. Does Eren intend on fulfilling his half-brother’s wishes or does he have a plan of his own?",
            "Japan’s post-apocalyptic wasteland replete with dust can only be saved by one thing—fungus. Bisco Akaboshi, a wanted criminal and skilled archer, searches for a legendary mushroom, known as Sabikui, said to devour any and all rust. Joining him on this epic saga to save the country is a giant crab and a young doctor. Can this unlikely trio find the fabled fungi and save the land?",
            "Ichigo Kurosaki is a rather normal high school student apart from the fact he has the ability to see ghosts. This ability never impacted his life in a major way until the day he encounters the Shinigami Kuchiki Rukia, who saves him and his family's lives from a Hollow, a corrupt spirit that devours human souls.",
            "Kagami Sakimori plays as the great mage Danblf in his favorite MMO. He falls asleep after a night of testing new character appearances, but instead of waking up to a suspended game, he’s inside of Arch Earth Online—as a girl! Now named Mira, he must convince the game’s people that Mira is a pupil of Danblf, who vanished without a trace 30 years ago…and figure out how he got here.",
            "In a world where magic is everything, Asta and Yuno are both found abandoned at a church on the same day. While Yuno is gifted with exceptional magical powers, Asta is the only one in this world without any. At the age of fifteen, both receive grimoires, magic books that amplify their holder’s magic. Asta’s is a rare Grimoire of Anti-Magic that negates and repels his opponent’s spells. Being opposite but good rivals, Yuno and Asta are ready for the hardest of challenges to achieve their common dream: to be the Wizard King. Giving up is never an option!"};

    int gambar[] = {R.drawable.piece,
            R.drawable.sono,
            R.drawable.ouji,
            R.drawable.ousama,
            R.drawable.princess,
            R.drawable.attack,
            R.drawable.bisco,
            R.drawable.bleach,
            R.drawable.kenja,
            R.drawable.black_clover};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        AnimeAdapter adapter = new AnimeAdapter(this, mJudul, mDetail, gambar);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == 0) {
                    Toast.makeText(MainActivity.this, "Gold Roger was known as the Pirate King, the strongest and most infamous being to have sailed the Grand Line. The capture and death of Roger by the World Government brought a change throughout the world. His last words before his death revealed the location of the greatest treasure in the world, One Piece. It was this revelation that brought about the Grand Age of Pirates, men who dreamed of finding One Piece (which promises an unlimited amount of riches and fame), and quite possibly the most coveted of titles for the person who found it, the title of the Pirate King.",Toast.LENGTH_SHORT).show();
                }
                if (position == 0) {
                    Toast.makeText(MainActivity.this, "High schooler Wakana Gojou cares about one thing: making Hina dolls. With nobody to share his obsession, he has trouble finding friends—or even holding conversation. But after the school’s most popular girl, Marin Kitagawa, reveals a secret of her own, he discovers a new purpose for his sewing skills. Together, they’ll make her cosplay dreams come true!",Toast.LENGTH_SHORT).show();
                }
                if (position == 0) {
                    Toast.makeText(MainActivity.this, "Once upon a time in a far away land there lived a prince, a genius prince. The genius prince fought alongside his people and led them to a great many triumphs. However, truth be told, he just wants to let everything go and live in tranquility.",Toast.LENGTH_SHORT).show();
                }
                if (position == 0) {
                    Toast.makeText(MainActivity.this, "Unable to hear, speak, or wield a sword, Prince Bojji doesn’t seem like a typical heir to the throne—and his kingdom agrees. But his fateful encounter with Kage, a shadow on the ground, gives him his first true friend. The two set off on a grand adventure and, together, form a bond that can overcome any obstacle...even being king.",Toast.LENGTH_SHORT).show();
                }
                if (position == 0) {
                    Toast.makeText(MainActivity.this, "Childhood friends Tachibana Hinata and Jinguuji Tsukasa were living the everyday life of office workers. Then, on the way home from a mixer, they were sent flying into another world by a mysterious being. Once there, Jinguuji sees his best friend has been turned into a beautiful blonde-haired, blue-eyed girl...?!",Toast.LENGTH_SHORT).show();
                }
                if (position == 0) {
                    Toast.makeText(MainActivity.this, "The war for Paradis zeroes in on Shiganshina just as Jaegerists have seized control. After taking a huge blow from a surprise attack led by Eren, Marley swiftly acts to return the favor. With Zeke’s true plan revealed and a military forced under new rule, this battle might be fought on two fronts. Does Eren intend on fulfilling his half-brother’s wishes or does he have a plan of his own?",Toast.LENGTH_SHORT).show();
                }
                if (position == 0) {
                    Toast.makeText(MainActivity.this, "Japan’s post-apocalyptic wasteland replete with dust can only be saved by one thing—fungus. Bisco Akaboshi, a wanted criminal and skilled archer, searches for a legendary mushroom, known as Sabikui, said to devour any and all rust. Joining him on this epic saga to save the country is a giant crab and a young doctor. Can this unlikely trio find the fabled fungi and save the land?",Toast.LENGTH_SHORT).show();
                }
                if (position == 0) {
                    Toast.makeText(MainActivity.this, "Ichigo Kurosaki is a rather normal high school student apart from the fact he has the ability to see ghosts. This ability never impacted his life in a major way until the day he encounters the Shinigami Kuchiki Rukia, who saves him and his family's lives from a Hollow, a corrupt spirit that devours human souls.",Toast.LENGTH_SHORT).show();
                }
                if (position == 0) {
                    Toast.makeText(MainActivity.this, "Kagami Sakimori plays as the great mage Danblf in his favorite MMO. He falls asleep after a night of testing new character appearances, but instead of waking up to a suspended game, he’s inside of Arch Earth Online—as a girl! Now named Mira, he must convince the game’s people that Mira is a pupil of Danblf, who vanished without a trace 30 years ago…and figure out how he got here.",Toast.LENGTH_SHORT).show();
                }
                if (position == 0) {
                    Toast.makeText(MainActivity.this, "In a world where magic is everything, Asta and Yuno are both found abandoned at a church on the same day. While Yuno is gifted with exceptional magical powers, Asta is the only one in this world without any. At the age of fifteen, both receive grimoires, magic books that amplify their holder’s magic. Asta’s is a rare Grimoire of Anti-Magic that negates and repels his opponent’s spells. Being opposite but good rivals, Yuno and Asta are ready for the hardest of challenges to achieve their common dream: to be the Wizard King. Giving up is never an option!",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    class AnimeAdapter extends ArrayAdapter<String> {
        Context context;
        String rJudul[];
        String rDetail[];
        int rGambar[];

        AnimeAdapter (Context c, String judul[], String detail[], int gambar[]) {
            super(c, R.layout.row, R.id.textView1, judul);
            this.context = c;
            this.rJudul = judul;
            this.rDetail = detail;
            this.rGambar = gambar;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row, parent, false);
            ImageView gambar = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.textView1);
            TextView myDetail = row.findViewById(R.id.textView2);

            gambar.setImageResource(rGambar[position]);
            myTitle.setText(rJudul[position]);
            myDetail.setText(rDetail[position]);


            return row;
        }
    }
}
