<div align="center">

# 🎵 Anghami Plus Patches

**A modern, lightweight enhancement suite for Anghami on Android, built for the Morphe ecosystem.**

[![Release](https://img.shields.io/github/v/release/Kero309x/anghamiplus-patches?style=for-the-badge&color=8A2BE2&logo=github)](https://github.com/Kero309x/anghamiplus-patches/releases)
[![Morphe](https://img.shields.io/badge/Morphe-Compatible-00C853?style=for-the-badge&logo=android)](https://morphe.software)
[![Target](https://img.shields.io/badge/Target-Anghami%208.0.28-FF5722?style=for-the-badge&logo=google-play)](https://play.google.com/store/apps/details?id=com.anghami)
[![License](https://img.shields.io/badge/License-GPL%20v3-blue.bar?style=for-the-badge)](LICENSE)

[Features](#-key-features) • [Installation](#-quick-install) • [Patches](#-included-patches) • [Building](#-build-from-source) • [Contributors](#-contributors)

</div>

---

## 📖 Overview

**Anghami Plus Patches** is a custom bytecode modification package crafted to deliver a clean, uninterrupted, and premium listening experience on the official Anghami Android client. 

By eliminating client-side playback restrictions, intrusive advertisements, and telemetry trackers, it restores full user control over playback queues, song selection, and UI appearance.

---

## ✨ Key Features

| Category | Highlights |
| :--- | :--- |
| 🚫 **Ad-Free Streaming** | Completely silences mid-song audio ads and dismisses annoying startup promotional flyers. |
| 🔀 **Unrestricted Playback** | Bypasses forced shuffle restrictions; pick and play any track on-demand with unlimited skips. |
| 👑 **Plus Identity** | Restores the verified Plus badge on user profile headers and inside account settings. |
| 🧹 **Decluttered Interface** | Strips out aggressive upgrade banners, locked upsell buttons, and Gold paywalls. |
| 🎤 **Full Synced Lyrics** | Unlocks complete synchronized song lyrics view and eliminates upsell locks. |
| 🛡️ **Privacy & Telemetry** | Neutrals internal behavioral trackers (Silo), third-party analytics, and Bugsnag crash reporters. |
| 📦 **Extended Offline Quotas** | Removes local offline storage caps and eliminates limited-plan quota verifications. |

---

## 📲 Quick Install

### Method 1: One-Click Morphe Import (Recommended)

1. Ensure you have **Morphe Manager** installed on your Android device.
2. Tap the link below to automatically add this repository as a patch source:

👉 **[Add to Morphe Manager](https://morphe.software/add-source?github=Kero309x/anghamiplus-patches)**

### Method 2: Manual Patching

1. Open **Morphe Manager** or **Morphe-Desktop**.
2. Add `Kero309x/anghamiplus-patches` to your Patch Sources.
3. Select the supported **Anghami APK (v8.0.28)**.
4. Choose your preferred patches (all enabled by default) and tap **Patch**.
5. Install and enjoy!

---

## 💊 Included Patches

<!-- PATCHES_START EXPANDED -->
> **[v1.1.0-dev.1](https://github.com/Kero309x/anghamiplus-patches/releases/tag/v1.1.0-dev.1)**&nbsp;&nbsp;•&nbsp;&nbsp;`dev`&nbsp;&nbsp;•&nbsp;&nbsp;14 patches total
<details open>
<summary>📦 Anghami&nbsp;&nbsp;•&nbsp;&nbsp;14 patches</summary>
<br>

**🎯 Supported versions:**

| 8.0.28 |
| :---: |

| 💊&nbsp;Patch | 📜&nbsp;Description | ⚙️&nbsp;Options |
|----------|----------------|-----------|
| [Block Audio Ads](#block-audio-ads) | Prevents audio advertisements between songs and treats playback tracks as ad-free. |  |
| [Block Promotional Popups](#block-promotional-popups) | Blocks startup popup offers, promotional flyers, and marketing dialogs. |  |
| [Disable Analytics & Crash Logging](#disable-analytics-crash-logging) | Disables third-party trackers, in-house user activity logging (Silo), and Bugsnag crash reporting. |  |
| [Disable Forced Shuffle](#disable-forced-shuffle) | Disables forced shuffle mode on playlists and radio, enabling full on-demand song selection. |  |
| [Expand Download Limits](#expand-download-limits) | Removes local offline storage caps and disables limited-plan quota checks. |  |
| [Hide Gold Upsell](#hide-gold-upsell) | Hides Gold-tier promotional sections and unsupported server-gated features. |  |
| [Hide Premium Feature Buttons](#hide-premium-feature-buttons) | Hides locked upsell buttons including Sing Along (Karaoke) and AI Mix triggers. |  |
| [Hide Shuffle Badges](#hide-shuffle-badges) | Hides 'Plays in shuffle' badges from playlists, album headers, and feed rows. |  |
| [Hide Upgrade Banners](#hide-upgrade-banners) | Hides navigation upgrade tab, header promo banners, and feed subscription upsell cards. |  |
| [Show Profile Plus Badge](#show-profile-plus-badge) | Displays the official Plus badge on your profile header and account settings. |  |
| [Spoof App Signature](#spoof-app-signature) | Emulates official application signature headers to preserve API authorization compatibility. |  |
| [Unlimited Track Skips](#unlimited-track-skips) | Removes song skip limitations and queue navigation restrictions. |  |
| [Unlock Full Lyrics](#unlock-full-lyrics) | Enables full synced lyrics display and removes paywall banners on song lyrics. |  |
| [Unlock Plus Experience](#unlock-plus-experience) | Enables client-side Plus features, eliminates free-tier playback restrictions, and enables offline UI mode. |  |

</details>

<!-- PATCHES_END -->

---

## 🎯 Target Compatibility

* **Target Application**: Anghami (`com.anghami`)
* **Target Version**: `8.0.28` (Version Code `8000280`)
* **Architectures**: `arm64-v8a`, `armeabi-v7a`, `x86`, `x86_64`
* **Distribution Format**: APK / APKM / Split APKs

---

## 🛠️ Build from Source

Requirements:
* **JDK 21+**
* A valid GitHub Personal Access Token (PAT) with `read:packages` scope (for downloading Morphe build plugins).

```bash
# Clone the repository
git clone https://github.com/Kero309x/anghamiplus-patches.git
cd anghamiplus-patches

# Build the .mpp package
./gradlew :patches:buildAndroid
```

The resulting compiled patch bundle will be generated in:
```
patches/build/libs/patches-1.0.0.mpp
```

---

## 👥 Contributors

* **[Kero309x](https://github.com/Kero309x)** — Project Creator, Lead Developer & Reverse Engineer
* **Gemini (Google DeepMind)** — AI Architecture, Bytecode Analysis & Pair Programming

---

## ⚠️ Disclaimer

This project is created strictly for educational, research, and personal customization purposes. It is not affiliated with, endorsed by, or associated with Anghami. Server-side protections (such as DRM licensing and high-bitrate audio streaming authorization) remain under the control of Anghami servers.

---

## 📜 License

Licensed under the [GNU General Public License v3.0](LICENSE).
