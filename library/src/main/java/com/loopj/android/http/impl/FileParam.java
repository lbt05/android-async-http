package com.loopj.android.http.impl;

import com.loopj.android.http.abstracts.AbstractRequestParam;

import org.jetbrains.annotations.Nullable;

import java.io.File;

public class FileParam extends AbstractRequestParam<File> {

    File value;

    public FileParam(File value) {
        super(value);
    }

    @Nullable
    @Override
    public File getValue() {
        return value;
    }

    @Override
    public void setValue(File value) {
        this.value = value;
    }

    @Nullable
    @Override
    public String getStringValue() {
        throw new UnsupportedOperationException("Not Yet Implemented");
    }

}
