package com.rajaryan.introscreen;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;

import com.github.appintro.AppIntro;
import com.github.appintro.AppIntroFragment;

public class MainActivity extends AppIntro {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addSlide(AppIntroFragment.newInstance("Tips","You can get every single tips for every field which you are pursuing or going to pursue.",R.drawable.tips1, ContextCompat.getColor(getApplicationContext(),R.color.bg_screen1)));
        addSlide(AppIntroFragment.newInstance("Frameworks","This is an essential supporting structure of any object, project or system in a theoretical format to understand the process step by step which can be directly implemented into your work.",R.drawable.frame1,ContextCompat.getColor(getApplicationContext(),R.color.bg_screen2)));
        addSlide(AppIntroFragment.newInstance("Your Idea","Here you can connect with like minded people just by referring an idea about anything like startups, social work or projects etc",R.drawable.idea1,ContextCompat.getColor(getApplicationContext(),R.color.bg_screen3)));
        addSlide(AppIntroFragment.newInstance("Top 10","Here you will get the best of 10 of everything with a bonus research of our team.",R.drawable.yadl,ContextCompat.getColor(getApplicationContext(),R.color.bg_screen4)));
        addSlide(AppIntroFragment.newInstance("Infozine","This is a unique, opportunistic, informative and a practical research work present in a delightful and in easily understandable way to make you more knowledgeable with some exciting facts and yes you can publish your articles too.",R.drawable.infozine,ContextCompat.getColor(getApplicationContext(),R.color.bg_screen5)));
        addSlide(AppIntroFragment.newInstance("Books","Here there is not only books which you can read but also some recommendations with summaries and our own publish and yes here you can publish your books too.",R.drawable.bksw,ContextCompat.getColor(getApplicationContext(),R.color.bg_screen6)));
        addSlide(AppIntroFragment.newInstance("Consultancy"," Here you can take private or commercial Consultations from experts and students and yes if you are capable to consult regarding your field or hobbies then you can also start as a consultant here.",R.drawable.con12,ContextCompat.getColor(getApplicationContext(),R.color.bg_screen7)));
        addSlide(AppIntroFragment.newInstance("Collaboration","Here you, your shop or your business and your agency can collaborate with us and yes if you want to start working as an intern or like job with some people, shop, agencies or businesses then yes we can connect them with you.",R.drawable.colaaa,ContextCompat.getColor(getApplicationContext(),R.color.bg_screen8)));
        addSlide(AppIntroFragment.newInstance("History","Here we will take you in adventures journey of our great culture and we will also get you some researches of different types of cultures too from the world with some feeds, research papers and videos.",R.drawable.historu,ContextCompat.getColor(getApplicationContext(),R.color.bg_screen1)));
        addSlide(AppIntroFragment.newInstance("Thinkouts","Here we will take you in exciting journey with some thrills and mysteries of our world which will make you feel alive with some feeds, research and videos",R.drawable.think11,ContextCompat.getColor(getApplicationContext(),R.color.bg_screen9)));
        addSlide(AppIntroFragment.newInstance("Hire Me","If you want to hire some people for your work you can and yes select your interest here and start your own work by providing your services .",R.drawable.hie,ContextCompat.getColor(getApplicationContext(),R.color.bg_screen1)));
        addSlide(AppIntroFragment.newInstance("Workshop","Here you can access many different kind of workshops related your interests and yes here you can start your own workshops with us.",R.drawable.worka,ContextCompat.getColor(getApplicationContext(),R.color.bg_screen10)));
        addSlide(AppIntroFragment.newInstance("Start Earning","If you want to start your basic earnings with some exciting ideas then let us know our team will provide you an hand holding support.",R.drawable.rev,ContextCompat.getColor(getApplicationContext(),R.color.bg_screen11)));

    }
    @Override
    protected void onSkipPressed(@Nullable Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        Intent i=new Intent(this,Home.class);
        startActivity(i);
    }

    @Override
    protected void onDonePressed(@Nullable Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        Intent i=new Intent(this,Home.class);
        startActivity(i);
    }
}
