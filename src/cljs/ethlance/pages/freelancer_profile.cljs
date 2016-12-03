(ns ethlance.pages.freelancer-profile
  (:require [cljs-react-material-ui.icons :as icons]))

(defn freelancer-profile []
  (fn []
    [:div
     (icons/action-accessibility)
     (icons/action-accessible)
     (icons/action-account-balance-wallet)
     (icons/action-account-balance)
     (icons/action-account-box)
     (icons/action-account-circle)
     (icons/action-add-shopping-cart)
     (icons/action-alarm-add)
     (icons/action-alarm-off)
     (icons/action-alarm-on)
     (icons/action-alarm)
     (icons/action-all-out)
     (icons/action-android)
     (icons/action-announcement)
     (icons/action-aspect-ratio)
     (icons/action-assessment)
     (icons/action-assignment-ind)
     (icons/action-assignment-late)
     (icons/action-assignment-return)
     (icons/action-assignment-returned)
     (icons/action-assignment-turned-in)
     (icons/action-assignment)
     (icons/action-autorenew)
     (icons/action-backup)
     (icons/action-book)
     (icons/action-bookmark-border)
     (icons/action-bookmark)
     (icons/action-bug-report)
     (icons/action-build)
     (icons/action-cached)
     (icons/action-camera-enhance)
     (icons/action-card-giftcard)
     (icons/action-card-membership)
     (icons/action-card-travel)
     (icons/action-change-history)
     (icons/action-check-circle)
     (icons/action-chrome-reader-mode)
     (icons/action-class)
     (icons/action-code)
     (icons/action-compare-arrows)
     (icons/action-copyright)
     (icons/action-credit-card)
     (icons/action-dashboard)
     (icons/action-date-range)
     (icons/action-delete-forever)
     (icons/action-delete)
     (icons/action-description)
     (icons/action-dns)
     (icons/action-done-all)
     (icons/action-done)
     (icons/action-donut-large)
     (icons/action-donut-small)
     (icons/action-eject)
     (icons/action-euro-symbol)
     (icons/action-event-seat)
     (icons/action-event)
     (icons/action-exit-to-app)
     (icons/action-explore)
     (icons/action-extension)
     (icons/action-face)
     (icons/action-favorite-border)
     (icons/action-favorite)
     (icons/action-feedback)
     (icons/action-find-in-page)
     (icons/action-find-replace)
     (icons/action-fingerprint)
     (icons/action-flight-land)
     (icons/action-flight-takeoff)
     (icons/action-flip-to-back)
     (icons/action-flip-to-front)
     (icons/action-g-translate)
     (icons/action-gavel)
     (icons/action-get-app)
     (icons/action-gif)
     (icons/action-grade)
     (icons/action-group-work)
     (icons/action-help-outline)
     (icons/action-help)
     (icons/action-highlight-off)
     (icons/action-history)
     (icons/action-home)
     (icons/action-hourglass-empty)
     (icons/action-hourglass-full)
     (icons/action-http)
     (icons/action-https)
     (icons/action-important-devices)
     (icons/action-info-outline)
     (icons/action-info)
     (icons/action-input)
     (icons/action-invert-colors)
     (icons/action-label-outline)
     (icons/action-label)
     (icons/action-language)
     (icons/action-launch)
     (icons/action-lightbulb-outline)
     (icons/action-line-style)
     (icons/action-line-weight)
     (icons/action-list)
     (icons/action-lock-open)
     (icons/action-lock-outline)
     (icons/action-lock)
     (icons/action-loyalty)
     (icons/action-markunread-mailbox)
     (icons/action-motorcycle)
     (icons/action-note-add)
     (icons/action-offline-pin)
     (icons/action-opacity)
     (icons/action-open-in-browser)
     (icons/action-open-in-new)
     (icons/action-open-with)
     (icons/action-pageview)
     (icons/action-pan-tool)
     (icons/action-payment)
     (icons/action-perm-camera-mic)
     (icons/action-perm-contact-calendar)
     (icons/action-perm-data-setting)
     (icons/action-perm-device-information)
     (icons/action-perm-identity)
     (icons/action-perm-media)
     (icons/action-perm-phone-msg)
     (icons/action-perm-scan-wifi)
     (icons/action-pets)
     (icons/action-picture-in-picture-alt)
     (icons/action-picture-in-picture)
     (icons/action-play-for-work)
     (icons/action-polymer)
     (icons/action-power-settings-new)
     (icons/action-pregnant-woman)
     (icons/action-print)
     (icons/action-query-builder)
     (icons/action-question-answer)
     (icons/action-receipt)
     (icons/action-record-voice-over)
     (icons/action-redeem)
     (icons/action-remove-shopping-cart)
     (icons/action-reorder)
     (icons/action-report-problem)
     (icons/action-restore-page)
     (icons/action-restore)
     (icons/action-room)
     (icons/action-rounded-corner)
     (icons/action-rowing)
     (icons/action-schedule)
     (icons/action-search)
     (icons/action-settings-applications)
     (icons/action-settings-backup-restore)
     (icons/action-settings-bluetooth)
     (icons/action-settings-brightness)
     (icons/action-settings-cell)
     (icons/action-settings-ethernet)
     (icons/action-settings-input-antenna)
     (icons/action-settings-input-component)
     (icons/action-settings-input-composite)
     (icons/action-settings-input-hdmi)
     (icons/action-settings-input-svideo)
     (icons/action-settings-overscan)
     (icons/action-settings-phone)
     (icons/action-settings-power)
     (icons/action-settings-remote)
     (icons/action-settings-voice)
     (icons/action-settings)
     (icons/action-shop-two)
     (icons/action-shop)
     (icons/action-shopping-basket)
     (icons/action-shopping-cart)
     (icons/action-speaker-notes-off)
     (icons/action-speaker-notes)
     (icons/action-spellcheck)
     (icons/action-stars)
     (icons/action-store)
     (icons/action-subject)
     (icons/action-supervisor-account)
     (icons/action-swap-horiz)
     (icons/action-swap-vert)
     (icons/action-swap-vertical-circle)
     (icons/action-system-update-alt)
     (icons/action-tab-unselected)
     (icons/action-tab)
     (icons/action-theaters)
     (icons/action-three-d-rotation)
     (icons/action-thumb-down)
     (icons/action-thumb-up)
     (icons/action-thumbs-up-down)
     (icons/action-timeline)
     (icons/action-toc)
     (icons/action-today)
     (icons/action-toll)
     (icons/action-touch-app)
     (icons/action-track-changes)
     (icons/action-translate)
     (icons/action-trending-down)
     (icons/action-trending-flat)
     (icons/action-trending-up)
     (icons/action-turned-in-not)
     (icons/action-turned-in)
     (icons/action-update)
     (icons/action-verified-user)
     (icons/action-view-agenda)
     (icons/action-view-array)
     (icons/action-view-carousel)
     (icons/action-view-column)
     (icons/action-view-day)
     (icons/action-view-headline)
     (icons/action-view-list)
     (icons/action-view-module)
     (icons/action-view-quilt)
     (icons/action-view-stream)
     (icons/action-view-week)
     (icons/action-visibility-off)
     (icons/action-visibility)
     (icons/action-watch-later)
     (icons/action-work)
     (icons/action-youtube-searched-for)
     (icons/action-zoom-in)
     (icons/action-zoom-out)
     (icons/alert-add-alert)
     (icons/alert-error-outline)
     (icons/alert-error)
     (icons/alert-warning)
     (icons/av-add-to-queue)
     (icons/av-airplay)
     (icons/av-album)
     (icons/av-art-track)
     (icons/av-av-timer)
     (icons/av-branding-watermark)
     (icons/av-call-to-action)
     (icons/av-closed-caption)
     (icons/av-equalizer)
     (icons/av-explicit)
     (icons/av-fast-forward)
     (icons/av-fast-rewind)
     (icons/av-featured-play-list)
     (icons/av-featured-video)
     (icons/av-fiber-dvr)
     (icons/av-fiber-manual-record)
     (icons/av-fiber-new)
     (icons/av-fiber-pin)
     (icons/av-fiber-smart-record)
     (icons/av-forward-1-0)
     (icons/av-forward-3-0)
     (icons/av-forward-5)
     (icons/av-games)
     (icons/av-hd)
     (icons/av-hearing)
     (icons/av-high-quality)
     (icons/av-library-add)
     (icons/av-library-books)
     (icons/av-library-music)
     (icons/av-loop)
     (icons/av-mic-none)
     (icons/av-mic-off)
     (icons/av-mic)
     (icons/av-movie)
     (icons/av-music-video)
     (icons/av-new-releases)
     (icons/av-not-interested)
     (icons/av-note)
     (icons/av-pause-circle-filled)
     (icons/av-pause-circle-outline)
     (icons/av-pause)
     (icons/av-play-arrow)
     (icons/av-play-circle-filled)
     (icons/av-play-circle-outline)
     (icons/av-playlist-add-check)
     (icons/av-playlist-add)
     (icons/av-playlist-play)
     (icons/av-queue-music)
     (icons/av-queue-play-next)
     (icons/av-queue)
     (icons/av-radio)
     (icons/av-recent-actors)
     (icons/av-remove-from-queue)
     (icons/av-repeat-one)
     (icons/av-repeat)
     (icons/av-replay-1-0)
     (icons/av-replay-3-0)
     (icons/av-replay-5)
     (icons/av-replay)
     (icons/av-shuffle)
     (icons/av-skip-next)
     (icons/av-skip-previous)
     (icons/av-slow-motion-video)
     (icons/av-snooze)
     (icons/av-sort-by-alpha)
     (icons/av-stop)
     (icons/av-subscriptions)
     (icons/av-subtitles)
     (icons/av-surround-sound)
     (icons/av-video-call)
     (icons/av-video-label)
     (icons/av-video-library)
     (icons/av-videocam-off)
     (icons/av-videocam)
     (icons/av-volume-down)
     (icons/av-volume-mute)
     (icons/av-volume-off)
     (icons/av-volume-up)
     (icons/av-web-asset)
     (icons/av-web)
     (icons/communication-business)
     (icons/communication-call-end)
     (icons/communication-call-made)
     (icons/communication-call-merge)
     (icons/communication-call-missed-outgoing)
     (icons/communication-call-missed)
     (icons/communication-call-received)
     (icons/communication-call-split)
     (icons/communication-call)
     (icons/communication-chat-bubble-outline)
     (icons/communication-chat-bubble)
     (icons/communication-chat)
     (icons/communication-clear-all)
     (icons/communication-comment)
     (icons/communication-contact-mail)
     (icons/communication-contact-phone)
     (icons/communication-contacts)
     (icons/communication-dialer-sip)
     (icons/communication-dialpad)
     (icons/communication-email)
     (icons/communication-forum)
     (icons/communication-import-contacts)
     (icons/communication-import-export)
     (icons/communication-invert-colors-off)
     (icons/communication-live-help)
     (icons/communication-location-off)
     (icons/communication-location-on)
     (icons/communication-mail-outline)
     (icons/communication-message)
     (icons/communication-no-sim)
     (icons/communication-phone)
     (icons/communication-phonelink-erase)
     (icons/communication-phonelink-lock)
     (icons/communication-phonelink-ring)
     (icons/communication-phonelink-setup)
     (icons/communication-portable-wifi-off)
     (icons/communication-present-to-all)
     (icons/communication-ring-volume)
     (icons/communication-rss-feed)
     (icons/communication-screen-share)
     (icons/communication-speaker-phone)
     (icons/communication-stay-current-landscape)
     (icons/communication-stay-current-portrait)
     (icons/communication-stay-primary-landscape)
     (icons/communication-stay-primary-portrait)
     (icons/communication-stop-screen-share)
     (icons/communication-swap-calls)
     (icons/communication-textsms)
     (icons/communication-voicemail)
     (icons/communication-vpn-key)
     (icons/content-add-box)
     (icons/content-add-circle-outline)
     (icons/content-add-circle)
     (icons/content-add)
     (icons/content-archive)
     (icons/content-backspace)
     (icons/content-block)
     (icons/content-clear)
     (icons/content-content-copy)
     (icons/content-content-cut)
     (icons/content-content-paste)
     (icons/content-create)
     (icons/content-delete-sweep)
     (icons/content-drafts)
     (icons/content-filter-list)
     (icons/content-flag)
     (icons/content-font-download)
     (icons/content-forward)
     (icons/content-gesture)
     (icons/content-inbox)
     (icons/content-link)
     (icons/content-low-priority)
     (icons/content-mail)
     (icons/content-markunread)
     (icons/content-move-to-inbox)
     (icons/content-next-week)
     (icons/content-redo)
     (icons/content-remove-circle-outline)
     (icons/content-remove-circle)
     (icons/content-remove)
     (icons/content-reply-all)
     (icons/content-reply)
     (icons/content-report)
     (icons/content-save)
     (icons/content-select-all)
     (icons/content-send)
     (icons/content-sort)
     (icons/content-text-format)
     (icons/content-unarchive)
     (icons/content-undo)
     (icons/content-weekend)
     (icons/device-access-alarm)
     (icons/device-access-alarms)
     (icons/device-access-time)
     (icons/device-add-alarm)
     (icons/device-airplanemode-active)
     (icons/device-airplanemode-inactive)
     (icons/device-battery-2-0)
     (icons/device-battery-3-0)
     (icons/device-battery-5-0)
     (icons/device-battery-6-0)
     (icons/device-battery-8-0)
     (icons/device-battery-9-0)
     (icons/device-battery-alert)
     (icons/device-battery-charging-2-0)
     (icons/device-battery-charging-3-0)
     (icons/device-battery-charging-5-0)
     (icons/device-battery-charging-6-0)
     (icons/device-battery-charging-8-0)
     (icons/device-battery-charging-9-0)
     (icons/device-battery-charging-full)
     (icons/device-battery-full)
     (icons/device-battery-std)
     (icons/device-battery-unknown)
     (icons/device-bluetooth-connected)
     (icons/device-bluetooth-disabled)
     (icons/device-bluetooth-searching)
     (icons/device-bluetooth)
     (icons/device-brightness-auto)
     (icons/device-brightness-high)
     (icons/device-brightness-low)
     (icons/device-brightness-medium)
     (icons/device-data-usage)
     (icons/device-developer-mode)
     (icons/device-devices)
     (icons/device-dvr)
     (icons/device-gps-fixed)
     (icons/device-gps-not-fixed)
     (icons/device-gps-off)
     (icons/device-graphic-eq)
     (icons/device-location-disabled)
     (icons/device-location-searching)
     (icons/device-network-cell)
     (icons/device-network-wifi)
     (icons/device-nfc)
     (icons/device-screen-lock-landscape)
     (icons/device-screen-lock-portrait)
     (icons/device-screen-lock-rotation)
     (icons/device-screen-rotation)
     (icons/device-sd-storage)
     (icons/device-settings-system-daydream)
     (icons/device-signal-cellular-0-bar)
     (icons/device-signal-cellular-1-bar)
     (icons/device-signal-cellular-2-bar)
     (icons/device-signal-cellular-3-bar)
     (icons/device-signal-cellular-4-bar)
     (icons/device-signal-cellular-no-sim)
     (icons/device-signal-cellular-null)
     (icons/device-signal-cellular-off)
     (icons/device-signal-wifi-0-bar)
     (icons/device-signal-wifi-1-bar-lock)
     (icons/device-signal-wifi-1-bar)
     (icons/device-signal-wifi-2-bar-lock)
     (icons/device-signal-wifi-2-bar)
     (icons/device-signal-wifi-3-bar-lock)
     (icons/device-signal-wifi-3-bar)
     (icons/device-signal-wifi-4-bar-lock)
     (icons/device-signal-wifi-4-bar)
     (icons/device-signal-wifi-off)
     (icons/device-storage)
     (icons/device-usb)
     (icons/device-wallpaper)
     (icons/device-widgets)
     (icons/device-wifi-lock)
     (icons/device-wifi-tethering)
     (icons/editor-attach-file)
     (icons/editor-attach-money)
     (icons/editor-border-all)
     (icons/editor-border-bottom)
     (icons/editor-border-clear)
     (icons/editor-border-color)
     (icons/editor-border-horizontal)
     (icons/editor-border-inner)
     (icons/editor-border-left)
     (icons/editor-border-outer)
     (icons/editor-border-right)
     (icons/editor-border-style)
     (icons/editor-border-top)
     (icons/editor-border-vertical)
     (icons/editor-bubble-chart)
     (icons/editor-drag-handle)
     (icons/editor-format-align-center)
     (icons/editor-format-align-justify)
     (icons/editor-format-align-left)
     (icons/editor-format-align-right)
     (icons/editor-format-bold)
     (icons/editor-format-clear)
     (icons/editor-format-color-fill)
     (icons/editor-format-color-reset)
     (icons/editor-format-color-text)
     (icons/editor-format-indent-decrease)
     (icons/editor-format-indent-increase)
     (icons/editor-format-italic)
     (icons/editor-format-line-spacing)
     (icons/editor-format-list-bulleted)
     (icons/editor-format-list-numbered)
     (icons/editor-format-paint)
     (icons/editor-format-quote)
     (icons/editor-format-shapes)
     (icons/editor-format-size)
     (icons/editor-format-strikethrough)
     (icons/editor-format-textdirection-l-to-r)
     (icons/editor-format-textdirection-r-to-l)
     (icons/editor-format-underlined)
     (icons/editor-functions)
     (icons/editor-highlight)
     (icons/editor-insert-chart)
     (icons/editor-insert-comment)
     (icons/editor-insert-drive-file)
     (icons/editor-insert-emoticon)
     (icons/editor-insert-invitation)
     (icons/editor-insert-link)
     (icons/editor-insert-photo)
     (icons/editor-linear-scale)
     (icons/editor-merge-type)
     (icons/editor-mode-comment)
     (icons/editor-mode-edit)
     (icons/editor-monetization-on)
     (icons/editor-money-off)
     (icons/editor-multiline-chart)
     (icons/editor-pie-chart-outlined)
     (icons/editor-pie-chart)
     (icons/editor-publish)
     (icons/editor-short-text)
     (icons/editor-show-chart)
     (icons/editor-space-bar)
     (icons/editor-strikethrough-s)
     (icons/editor-text-fields)
     (icons/editor-title)
     (icons/editor-vertical-align-bottom)
     (icons/editor-vertical-align-center)
     (icons/editor-vertical-align-top)
     (icons/editor-wrap-text)
     (icons/file-attachment)
     (icons/file-cloud-circle)
     (icons/file-cloud-done)
     (icons/file-cloud-download)
     (icons/file-cloud-off)
     (icons/file-cloud-queue)
     (icons/file-cloud-upload)
     (icons/file-cloud)
     (icons/file-create-new-folder)
     (icons/file-file-download)
     (icons/file-file-upload)
     (icons/file-folder-open)
     (icons/file-folder-shared)
     (icons/file-folder)
     (icons/hardware-cast-connected)
     (icons/hardware-cast)
     (icons/hardware-computer)
     (icons/hardware-desktop-mac)
     (icons/hardware-desktop-windows)
     (icons/hardware-developer-board)
     (icons/hardware-device-hub)
     (icons/hardware-devices-other)
     (icons/hardware-dock)
     (icons/hardware-gamepad)
     (icons/hardware-headset-mic)
     (icons/hardware-headset)
     (icons/hardware-keyboard-arrow-down)
     (icons/hardware-keyboard-arrow-left)
     (icons/hardware-keyboard-arrow-right)
     (icons/hardware-keyboard-arrow-up)
     (icons/hardware-keyboard-backspace)
     (icons/hardware-keyboard-capslock)
     (icons/hardware-keyboard-hide)
     (icons/hardware-keyboard-return)
     (icons/hardware-keyboard-tab)
     (icons/hardware-keyboard-voice)
     (icons/hardware-keyboard)
     (icons/hardware-laptop-chromebook)
     (icons/hardware-laptop-mac)
     (icons/hardware-laptop-windows)
     (icons/hardware-laptop)
     (icons/hardware-memory)
     (icons/hardware-mouse)
     (icons/hardware-phone-android)
     (icons/hardware-phone-iphone)
     (icons/hardware-phonelink-off)
     (icons/hardware-phonelink)
     (icons/hardware-power-input)
     (icons/hardware-router)
     (icons/hardware-scanner)
     (icons/hardware-security)
     (icons/hardware-sim-card)
     (icons/hardware-smartphone)
     (icons/hardware-speaker-group)
     (icons/hardware-speaker)
     (icons/hardware-tablet-android)
     (icons/hardware-tablet-mac)
     (icons/hardware-tablet)
     (icons/hardware-toys)
     (icons/hardware-tv)
     (icons/hardware-videogame-asset)
     (icons/hardware-watch)
     (icons/image-add-a-photo)
     (icons/image-add-to-photos)
     (icons/image-adjust)
     (icons/image-assistant-photo)
     (icons/image-assistant)
     (icons/image-audiotrack)
     (icons/image-blur-circular)
     (icons/image-blur-linear)
     (icons/image-blur-off)
     (icons/image-blur-on)
     (icons/image-brightness-1)
     (icons/image-brightness-2)
     (icons/image-brightness-3)
     (icons/image-brightness-4)
     (icons/image-brightness-5)
     (icons/image-brightness-6)
     (icons/image-brightness-7)
     (icons/image-broken-image)
     (icons/image-brush)
     (icons/image-burst-mode)
     (icons/image-camera-alt)
     (icons/image-camera-front)
     (icons/image-camera-rear)
     (icons/image-camera-roll)
     (icons/image-camera)
     (icons/image-center-focus-strong)
     (icons/image-center-focus-weak)
     (icons/image-collections-bookmark)
     (icons/image-collections)
     (icons/image-color-lens)
     (icons/image-colorize)
     (icons/image-compare)
     (icons/image-control-point-duplicate)
     (icons/image-control-point)
     (icons/image-crop-1-6-9)
     (icons/image-crop-3-2)
     (icons/image-crop-5-4)
     (icons/image-crop-7-5)
     (icons/image-crop-din)
     (icons/image-crop-free)
     (icons/image-crop-landscape)
     (icons/image-crop-original)
     (icons/image-crop-portrait)
     (icons/image-crop-rotate)
     (icons/image-crop-square)
     (icons/image-crop)
     (icons/image-dehaze)
     (icons/image-details)
     (icons/image-edit)
     (icons/image-exposure-neg-1)
     (icons/image-exposure-neg-2)
     (icons/image-exposure-plus-1)
     (icons/image-exposure-plus-2)
     (icons/image-exposure-zero)
     (icons/image-exposure)
     (icons/image-filter-1)
     (icons/image-filter-2)
     (icons/image-filter-3)
     (icons/image-filter-4)
     (icons/image-filter-5)
     (icons/image-filter-6)
     (icons/image-filter-7)
     (icons/image-filter-8)
     (icons/image-filter-9-plus)
     (icons/image-filter-9)
     (icons/image-filter-b-and-w)
     (icons/image-filter-center-focus)
     (icons/image-filter-drama)
     (icons/image-filter-frames)
     (icons/image-filter-hdr)
     (icons/image-filter-none)
     (icons/image-filter-tilt-shift)
     (icons/image-filter-vintage)
     (icons/image-filter)
     (icons/image-flare)
     (icons/image-flash-auto)
     (icons/image-flash-off)
     (icons/image-flash-on)
     (icons/image-flip)
     (icons/image-gradient)
     (icons/image-grain)
     (icons/image-grid-off)
     (icons/image-grid-on)
     (icons/image-hdr-off)
     (icons/image-hdr-on)
     (icons/image-hdr-strong)
     (icons/image-hdr-weak)
     (icons/image-healing)
     (icons/image-image-aspect-ratio)
     (icons/image-image)
     (icons/image-iso)
     (icons/image-landscape)
     (icons/image-leak-add)
     (icons/image-leak-remove)
     (icons/image-lens)
     (icons/image-linked-camera)
     (icons/image-looks-3)
     (icons/image-looks-4)
     (icons/image-looks-5)
     (icons/image-looks-6)
     (icons/image-looks-one)
     (icons/image-looks-two)
     (icons/image-looks)
     (icons/image-loupe)
     (icons/image-monochrome-photos)
     (icons/image-movie-creation)
     (icons/image-movie-filter)
     (icons/image-music-note)
     (icons/image-nature-people)
     (icons/image-nature)
     (icons/image-navigate-before)
     (icons/image-navigate-next)
     (icons/image-palette)
     (icons/image-panorama-fish-eye)
     (icons/image-panorama-horizontal)
     (icons/image-panorama-vertical)
     (icons/image-panorama-wide-angle)
     (icons/image-panorama)
     (icons/image-photo-album)
     (icons/image-photo-camera)
     (icons/image-photo-filter)
     (icons/image-photo-library)
     (icons/image-photo-size-select-actual)
     (icons/image-photo-size-select-large)
     (icons/image-photo-size-select-small)
     (icons/image-photo)
     (icons/image-picture-as-pdf)
     (icons/image-portrait)
     (icons/image-remove-red-eye)
     (icons/image-rotate-9-0-degrees-ccw)
     (icons/image-rotate-left)
     (icons/image-rotate-right)
     (icons/image-slideshow)
     (icons/image-straighten)
     (icons/image-style)
     (icons/image-switch-camera)
     (icons/image-switch-video)
     (icons/image-tag-faces)
     (icons/image-texture)
     (icons/image-timelapse)
     (icons/image-timer-1-0)
     (icons/image-timer-3)
     (icons/image-timer-off)
     (icons/image-timer)
     (icons/image-tonality)
     (icons/image-transform)
     (icons/image-tune)
     (icons/image-view-comfy)
     (icons/image-view-compact)
     (icons/image-vignette)
     (icons/image-wb-auto)
     (icons/image-wb-cloudy)
     (icons/image-wb-incandescent)
     (icons/image-wb-iridescent)
     (icons/image-wb-sunny)
     (icons/maps-add-location)
     (icons/maps-beenhere)
     (icons/maps-directions-bike)
     (icons/maps-directions-boat)
     (icons/maps-directions-bus)
     (icons/maps-directions-car)
     (icons/maps-directions-railway)
     (icons/maps-directions-run)
     (icons/maps-directions-subway)
     (icons/maps-directions-transit)
     (icons/maps-directions-walk)
     (icons/maps-directions)
     (icons/maps-edit-location)
     (icons/maps-ev-station)
     (icons/maps-flight)
     (icons/maps-hotel)
     (icons/maps-layers-clear)
     (icons/maps-layers)
     (icons/maps-local-activity)
     (icons/maps-local-airport)
     (icons/maps-local-atm)
     (icons/maps-local-bar)
     (icons/maps-local-cafe)
     (icons/maps-local-car-wash)
     (icons/maps-local-convenience-store)
     (icons/maps-local-dining)
     (icons/maps-local-drink)
     (icons/maps-local-florist)
     (icons/maps-local-gas-station)
     (icons/maps-local-grocery-store)
     (icons/maps-local-hospital)
     (icons/maps-local-hotel)
     (icons/maps-local-laundry-service)
     (icons/maps-local-library)
     (icons/maps-local-mall)
     (icons/maps-local-movies)
     (icons/maps-local-offer)
     (icons/maps-local-parking)
     (icons/maps-local-pharmacy)
     (icons/maps-local-phone)
     (icons/maps-local-pizza)
     (icons/maps-local-play)
     (icons/maps-local-post-office)
     (icons/maps-local-printshop)
     (icons/maps-local-see)
     (icons/maps-local-shipping)
     (icons/maps-local-taxi)
     (icons/maps-map)
     (icons/maps-my-location)
     (icons/maps-navigation)
     (icons/maps-near-me)
     (icons/maps-person-pin-circle)
     (icons/maps-person-pin)
     (icons/maps-pin-drop)
     (icons/maps-place)
     (icons/maps-rate-review)
     (icons/maps-restaurant-menu)
     (icons/maps-restaurant)
     (icons/maps-satellite)
     (icons/maps-store-mall-directory)
     (icons/maps-streetview)
     (icons/maps-subway)
     (icons/maps-terrain)
     (icons/maps-traffic)
     (icons/maps-train)
     (icons/maps-tram)
     (icons/maps-transfer-within-a-station)
     (icons/maps-zoom-out-map)
     (icons/navigation-apps)
     (icons/navigation-arrow-back)
     (icons/navigation-arrow-downward)
     (icons/navigation-arrow-drop-down-circle)
     (icons/navigation-arrow-drop-down)
     (icons/navigation-arrow-drop-up)
     (icons/navigation-arrow-forward)
     (icons/navigation-arrow-upward)
     (icons/navigation-cancel)
     (icons/navigation-check)
     (icons/navigation-chevron-left)
     (icons/navigation-chevron-right)
     (icons/navigation-close)
     (icons/navigation-expand-less)
     (icons/navigation-expand-more)
     (icons/navigation-first-page)
     (icons/navigation-fullscreen-exit)
     (icons/navigation-fullscreen)
     (icons/navigation-last-page)
     (icons/navigation-menu)
     (icons/navigation-more-horiz)
     (icons/navigation-more-vert)
     (icons/navigation-refresh)
     (icons/navigation-subdirectory-arrow-left)
     (icons/navigation-subdirectory-arrow-right)
     (icons/navigation-unfold-less)
     (icons/navigation-unfold-more)
     (icons/navigation-arrow-drop-right)
     (icons/notification-adb)
     (icons/notification-airline-seat-flat-angled)
     (icons/notification-airline-seat-recline-extra)
     (icons/notification-airline-seat-recline-normal)
     (icons/notification-bluetooth-audio)
     (icons/notification-confirmation-number)
     (icons/notification-disc-full)
     (icons/notification-do-not-disturb-alt)
     (icons/notification-do-not-disturb-off)
     (icons/notification-do-not-disturb-on)
     (icons/notification-do-not-disturb)
     (icons/notification-drive-eta)
     (icons/notification-enhanced-encryption)
     (icons/notification-event-available)
     (icons/notification-event-busy)
     (icons/notification-event-note)
     (icons/notification-folder-special)
     (icons/notification-live-tv)
     (icons/notification-mms)
     (icons/notification-more)
     (icons/notification-network-check)
     (icons/notification-network-locked)
     (icons/notification-no-encryption)
     (icons/notification-ondemand-video)
     (icons/notification-personal-video)
     (icons/notification-phone-bluetooth-speaker)
     (icons/notification-phone-forwarded)
     (icons/notification-phone-in-talk)
     (icons/notification-phone-locked)
     (icons/notification-phone-missed)
     (icons/notification-phone-paused)
     (icons/notification-power)
     (icons/notification-priority-high)
     (icons/notification-rv-hookup)
     (icons/notification-sd-card)
     (icons/notification-sim-card-alert)
     (icons/notification-sms-failed)
     (icons/notification-sms)
     (icons/notification-sync-disabled)
     (icons/notification-sync-problem)
     (icons/notification-sync)
     (icons/notification-system-update)
     (icons/notification-tap-and-play)
     (icons/notification-time-to-leave)
     (icons/notification-vibration)
     (icons/notification-voice-chat)
     (icons/notification-vpn-lock)
     (icons/notification-wc)
     (icons/notification-wifi)
     (icons/places-ac-unit)
     (icons/places-airport-shuttle)
     (icons/places-all-inclusive)
     (icons/places-beach-access)
     (icons/places-business-center)
     (icons/places-casino)
     (icons/places-child-care)
     (icons/places-child-friendly)
     (icons/places-fitness-center)
     (icons/places-free-breakfast)
     (icons/places-golf-course)
     (icons/places-hot-tub)
     (icons/places-kitchen)
     (icons/places-pool)
     (icons/places-room-service)
     (icons/places-rv-hookup)
     (icons/places-smoke-free)
     (icons/places-smoking-rooms)
     (icons/places-spa)
     (icons/social-cake)
     (icons/social-domain)
     (icons/social-group-add)
     (icons/social-group)
     (icons/social-location-city)
     (icons/social-mood-bad)
     (icons/social-mood)
     (icons/social-notifications-active)
     (icons/social-notifications-none)
     (icons/social-notifications-off)
     (icons/social-notifications-paused)
     (icons/social-notifications)
     (icons/social-pages)
     (icons/social-party-mode)
     (icons/social-people-outline)
     (icons/social-people)
     (icons/social-person-add)
     (icons/social-person-outline)
     (icons/social-person)
     (icons/social-plus-one)
     (icons/social-poll)
     (icons/social-public)
     (icons/social-school)
     (icons/social-sentiment-dissatisfied)
     (icons/social-sentiment-neutral)
     (icons/social-sentiment-satisfied)
     (icons/social-sentiment-very-dissatisfied)
     (icons/social-sentiment-very-satisfied)
     (icons/social-share)
     (icons/social-whatshot)
     (icons/toggle-check-box-outline-blank)
     (icons/toggle-check-box)
     (icons/toggle-indeterminate-check-box)
     (icons/toggle-radio-button-checked)
     (icons/toggle-radio-button-unchecked)
     (icons/toggle-star-border)
     (icons/toggle-star-half)
     (icons/toggle-star)]))