class AccountManager {
    private static final int MIN_PASSWORD_LENGTH = 8;

    public void createAccount(String username, String password) throws AccountException {
        if (username == null || username.isEmpty()) {
            throw new AccountException("Kullanıcı adı boş olamaz.");
        }

        if (password == null || password.length() < MIN_PASSWORD_LENGTH) {
            throw new AccountException("Parola en az " + MIN_PASSWORD_LENGTH + " karakter olmalıdır.");
        }

        // Hesap oluşturma işlemi
        System.out.println("Hesap oluşturuldu: " + username);
    }

    public void updatePassword(String username, String oldPassword, String newPassword) throws AccountException {
        // Parola güncelleme işlemi
        if (newPassword == null || newPassword.length() < MIN_PASSWORD_LENGTH) {
            throw new AccountException("Yeni parola en az " + MIN_PASSWORD_LENGTH + " karakter olmalıdır.");
        }

        if (oldPassword.equals(newPassword)) {
            throw new AccountException("Yeni parola, eski paroladan farklı olmalıdır.");
        }

        System.out.println("Parola güncellendi: " + newPassword);
    }
}

class AccountException extends Exception {
    public AccountException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        AccountManager accountManager = new AccountManager();

        // Test senaryoları
        try {
            // Geçerli bir hesap oluşturma
            accountManager.createAccount("user123", "strongpassword");

            // Geçersiz bir parola ile hesap oluşturma
            accountManager.createAccount("user456", "123");

            // Geçerli bir parola güncelleme
            accountManager.updatePassword("user123", "oldpassword", "newstrongpassword");

            // Geçersiz bir parola ile parola güncelleme
            accountManager.updatePassword("user123", "newstrongpassword", "weak");
        } catch (AccountException e) {
            // Hesap istisnalarını ele al
            System.out.println("Hata: " + e.getMessage());
        }
    }
}