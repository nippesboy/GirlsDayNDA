package com.example.girlsdaynda.ui.gallery;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GalleryViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public GalleryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Mit dem E-roller kann ich ganz chillig in die schule fahren.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}