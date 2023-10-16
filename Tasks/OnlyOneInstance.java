class OnlyOneInstance {

    private static Set<Class> instances = new HashSet<>();
    public OnlyOneInstance() {
        if (instances.contains(this.getClass())) {
            throw new IllegalStateException();
        }
        instances.add(getClass());
    }
}


