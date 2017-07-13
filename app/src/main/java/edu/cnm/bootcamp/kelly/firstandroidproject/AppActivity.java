package edu.cnm.bootcamp.kelly.firstandroidproject;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import edu.cnm.bootcamp.kelly.firstandroidproject.fragments.ListFragment;

public class AppActivity extends AppCompatActivity implements ListFragment.OnFragmentInteractionListener {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_app);

    findViewById(R.id.btnLoadFragment).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        loadFragment();
      }
    });
  }

  private void loadFragment() {
    FragmentManager fragmentManager = getSupportFragmentManager();
    ListFragment listFragment = ListFragment.newInstance();
    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    fragmentTransaction.add(R.id.fragmentContainer, listFragment);
    fragmentTransaction.commit();
  }
}