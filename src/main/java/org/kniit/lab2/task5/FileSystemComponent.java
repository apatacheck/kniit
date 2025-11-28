package org.kniit.lab2.task5;

abstract class FileSystemComponent {
    protected String name;

    public FileSystemComponent(String name) {
        this.name = name;
    }

    public abstract double getSize();
    public abstract void display(String indent);


    public void add(FileSystemComponent component) {
        throw new UnsupportedOperationException("Не поддерживается для файлов");
    }

    public void remove(FileSystemComponent component) {
        throw new UnsupportedOperationException("Не поддерживается для файлов");
    }
}
