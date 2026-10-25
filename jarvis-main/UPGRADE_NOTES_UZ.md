# JARVIS — yangilangan loyiha

Bu paket avvalgi JARVIS loyihasining mavjud fayllarini saqlagan holda tayyorlangan. Yangi dizayn: to‘q navy fon, neon cyan/violet ranglar, ilova ichida brend sarlavhasi va status indikatori.

## Saqlangan asosiy bo‘limlar
- Ovozli yordamchi va buyruqlar
- Video studiya / ssenariy / video render qilish
- Vazifalar navbati va tasdiqlash mexanizmi
- YouTube, Instagram va Telegram integratsiya fayllari
- Eslatmalar, bildirishnomalar va ish rejalashtirish
- Backend, xavfsizlik va token saqlash qismlari
- GitHub Actions orqali APK build workflow

## GitHub’ga yuklash
1. ZIP’ni telefon yoki kompyuterda oching.
2. ZIP ichidagi `jarvis-main` papkasiga kiring.
3. `jarvis-main` ichidagi fayl va papkalarni GitHub repozitoriyining ildiziga yuklang (`app`, `.github`, `build.gradle.kts`, `settings.gradle.kts` va boshqalar). `jarvis-main` papkasini yana ichma-ich qilib joylashtirmang.
4. GitHub → Actions → Build APK → Run workflow yoki yangi commitdan keyin buildni tekshiring.
5. Build yashil bo‘lsa, Artifacts ichidan APK oling. Qizil bo‘lsa, logdagi birinchi `What went wrong` xatosini tekshiring.

## Muhim
- Bu ZIP manba kodli loyiha; oldindan kompilyatsiya qilingan APK emas.
- API/Google OAuth kalitlari avtomatik qo‘shilmaydi. `SETUP_YOUTUBE.md` va backend README ko‘rsatmalarini bajaring.
- Ijtimoiy tarmoqlarga joylash kabi amallar platforma ruxsati va foydalanuvchi tasdig‘ini talab qiladi.
- Ushbu muhitda Android Gradle buildini to‘liq ishga tushirib tekshirish imkoni bo‘lmadi. Shuning uchun APK build muvaffaqiyatli bo‘lishi kafolatlanmaydi; GitHub Actions logi bilan tekshiring.
