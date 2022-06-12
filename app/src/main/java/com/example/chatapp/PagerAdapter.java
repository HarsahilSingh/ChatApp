package com.example.chatapp;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.chatapp.Fragments.ChatsFragment;
import com.example.chatapp.Fragments.ProfileFragment;
import com.example.chatapp.Fragments.UsersFragment;

//Pager Adapter class(Helps in navigating through the Fragments)
public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        //Getting the fragments by using switch statement
        switch (position) {
            case 0:
                ChatsFragment tab1 = new ChatsFragment();
                return tab1;
            case 1:
                UsersFragment tab2 = new UsersFragment();
                return tab2;
            case 2:
                ProfileFragment tab3 = new ProfileFragment();
                return tab3;
            default:
                return null;
        }
    }
    //Getting the count of the number of tabs
    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}