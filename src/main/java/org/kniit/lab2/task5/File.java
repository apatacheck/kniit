package org.kniit.lab2.task5;

class File extends FileSystemComponent {
    private double size;

    public File(String name, double size) {
        super(name);
        this.size = size;
    }

    @Override
    public double getSize() {
        return size;
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + name + " (" + size + " bytes)");
    }
}