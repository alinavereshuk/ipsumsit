try {
    // Code that may throw an exception
    int result = someMethodThatMightThrowException();
    System.out.println(result);
} catch (IOException e) {
    // Handle IOException
    e.printStackTrace();
} catch (NumberFormatException e) {
    // Handle NumberFormatException
    e.printStackTrace();
} catch (Exception e) {
    // Handle other types of exceptions
    e.printStackTrace();
}
