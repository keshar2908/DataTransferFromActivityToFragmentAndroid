# DataTransferFromActivityToFragmentAndroid
In this project i can try to send data from activity to fragment by taking input from user

#Code for Fragment transaction
FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        MyFragment myFragment=new MyFragment();
        fragmentTransaction.add(R.id.content_frame,myFragment);
        fragmentTransaction.commit();
