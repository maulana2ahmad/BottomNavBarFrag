package com.mractiveiddev.bottomnavbarfrag;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
//    private BottomNavigationView mMainNav;
//    private FrameLayout mMainFrame;
//
//    private HomeFragment homeFragment;
//    private MallFragment mallFragment;
//    private NotificationFragment notificationFragment;
//    private TransactionFragment transactionFragment;
//    private AccountFragment accountFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_nav);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.frame_bottom, new HomeFragment()).commit();

//        mMainFrame = (FrameLayout) findViewById(R.id.main_frame);
//        mMainNav = (BottomNavigationView) findViewById(R.id.main_nav);
//
//        homeFragment = new HomeFragment();
//        mallFragment = new MallFragment();
//        notificationFragment = new NotificationFragment();
//        transactionFragment = new TransactionFragment();
//        accountFragment = new AccountFragment();
//
//        setFragment(homeFragment);
//
//
//        mMainNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                switch (item.getItemId()) {
//                    case R.id.nav_home:
//                      //  mMainNav.setItemBackgroundResource(R.color.colorPrimary);
//                        setFragment(homeFragment);
//                        return true;
//                    case R.id.nav_mall:
//                      //  mMainNav.setItemBackgroundResource(R.color.colorAccent);
//                        setFragment(mallFragment);
//                        return true;
//                    case R.id.nav_notif:
//                      //  mMainNav.setItemBackgroundResource(R.color.colorAccent);
//                        setFragment(notificationFragment);
//                        return true;
//                    case R.id.nav_transaction:
//                        //mMainNav.setItemBackgroundResource(R.color.colorAccent);
//                        setFragment(transactionFragment);
//                        return true;
//                    case R.id.nav_account:
//                       // mMainNav.setItemBackgroundResource(R.color.colorAccent);
//                        setFragment(accountFragment);
//                        return true;
//
//                    default:
//                        return false;
//                }
//            }
//        });
//
//    }
//
//    private void setFragment(Fragment fragment) {
//
//        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//        fragmentTransaction.replace(R.id.main_frame, fragment);
//        fragmentTransaction.commit();
//
    }
    private BottomNavigationView.OnNavigationItemSelectedListener navListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectedFragment = null;
            switch (item.getItemId()) {
                case R.id.nav_home:
                    selectedFragment = new HomeFragment();
                    break;
                case R.id.nav_mall:
                    selectedFragment = new MallFragment();
                    break;
                case R.id.nav_notif:
                    selectedFragment = new NotificationFragment();
                    break;
                case R.id.nav_transaction:
                    selectedFragment = new TransactionFragment();
                    break;
                case R.id.nav_account:
                    selectedFragment = new AccountFragment();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.frame_bottom, selectedFragment).commit();

            return true;
        }
    };
}
